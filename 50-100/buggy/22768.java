@java.lang.Override
public void taskExecuted(org.apache.pivot.util.concurrent.Task<java.lang.String> t) {
    org.agmip.ui.quadui.QuadUIWindow.LOG.info(((getCurBatchInfo(true)) + "Dump to JSON successfully"));
    txtStatus.setText(((getCurBatchInfo(true)) + "Completed"));
    if (((batEngine) == null) || (!(batEngine.hasNext()))) {
        org.apache.pivot.wtk.Alert.alert(MessageType.INFO, "Translation completed", this);
        org.agmip.ui.quadui.QuadUIWindow.LOG.info("=== Completed translation job ===");
    }
    enableConvertIndicator(false);
}