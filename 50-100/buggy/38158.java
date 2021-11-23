private java.lang.Boolean isDoneItemsPresent() {
    java.lang.String doneItems = isebase.cognito.tourpilot.Connection.ConnectionAsyncTask.getDoneStr();
    if (doneItems == "")
        return true;
    
    isebase.cognito.tourpilot.Dialogs.BaseInfoDialog dialog = new isebase.cognito.tourpilot.Dialogs.BaseInfoDialog(getString(R.string.attention), getString(R.string.dialog_do_sync));
    dialog.show(getSupportFragmentManager(), "dialogDoSync");
    return false;
}