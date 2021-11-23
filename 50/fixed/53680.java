protected void restartPreview() {
    if ((handler) != null) {
        android.os.Message restartMessage = android.os.Message.obtain();
        restartMessage.what = R.id.restart_preview;
        handler.handleMessage(restartMessage);
    }
}