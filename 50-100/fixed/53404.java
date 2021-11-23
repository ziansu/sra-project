@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    MyCustomService.dialogPushConfiguration.setDisplayType(NCMBDialogPushConfiguration.DIALOG_DISPLAY_DIALOG);
    com.nifty.cloud.mb.core.NCMBPush push = new com.nifty.cloud.mb.core.NCMBPush();
    push.setTitle("Notification Dialog");
    push.setMessage("Show dialog for testing");
    push.setDialog(true);
    try {
        push.send();
    } catch (com.nifty.cloud.mb.core.NCMBException e) {
        com.nifty.cloud.mb.core.NCMBException error = e;
    }
    return null;
}