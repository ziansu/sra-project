@java.lang.Override
public void executeFailed(org.apache.pivot.util.concurrent.Task<java.lang.String> arg0) {
    org.agmip.ui.quadui.QuadUIWindow.LOG.info(((getCurBatchInfo(true)) + "Dump to JSON failed"));
    org.agmip.ui.quadui.QuadUIWindow.LOG.error(((getCurBatchInfo(true)) + (org.agmip.ui.quadui.QuadUIWindow.getStackTrace(arg0.getFault()))));
    org.apache.pivot.wtk.Alert.alert(MessageType.ERROR, arg0.getFault().toString(), this);
}