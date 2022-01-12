@java.lang.Override
public void run() {
    try {
        java.lang.String info = mCommandUtil.exec(com.jrdcom.systrace.service.AtraceService.SP_CMD_PS_FLAG).trim();
        com.jrdcom.systrace.service.AtraceService.sShowPsInfo = (java.lang.Integer.parseInt(info)) != 0;
        com.jrdcom.systrace.toolbox.CommandUtil.myLogger(com.jrdcom.systrace.service.AtraceService.TAG, ("prepareProperty: sShowPsInfo= " + (com.jrdcom.systrace.service.AtraceService.sShowPsInfo)));
    } catch (java.lang.NumberFormatException e) {
        com.jrdcom.systrace.service.AtraceService.sShowPsInfo = false;
        com.jrdcom.systrace.toolbox.CommandUtil.myLogger(com.jrdcom.systrace.service.AtraceService.TAG, "Error for prepareProperty: EXCEPTION!");
        e.printStackTrace();
    }
}