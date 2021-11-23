public void createInstance(android.view.View v) {
    this.progressDialogWaitStop.show();
    new org.stackdroid.activities.ServersActivity.AsyncTaskOSListImages().execute();
    this.manageInstanceDialog.dismiss();
}