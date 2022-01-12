@java.lang.Override
public void run() {
    try {
        dlg = new com.aeon.octopus.OctopusTxDlg(OctopusTxDlg.DEDUCT_VALUE_MODE, java.lang.Double.parseDouble(amt), invNo, language, debug);
        dlg.doTx(hasOctopus);
        dlg.semp.acquire();
        dlg.semp.release();
        ret_message = dlg.getReturnMsg();
        dlg = null;
    } catch (java.lang.Exception e) {
        logger.error("{}", e.getMessage(), e);
        ret_message = setReturnErrMsg(LangConst.RET_STATUS_FAILED, "ERR-999", e.getMessage());
    }
}