@java.lang.Override
public void run() {
    dlg = new com.aeon.octopus.OctopusTxDlg(OctopusTxDlg.DEDUCT_VALUE_MODE, java.lang.Double.parseDouble(amt), invNo, language, debug);
    dlg.doTx(hasOctopus);
    try {
        dlg.semp.acquire();
        dlg.semp.release();
        ret_message = dlg.getReturnMsg();
        dlg = null;
    } catch (java.lang.InterruptedException e) {
        logger.error("{}", e, e);
        ret_message = setReturnErrMsg(LangConst.RET_STATUS_FAILED, "ERR-999", e.getMessage());
    }
}