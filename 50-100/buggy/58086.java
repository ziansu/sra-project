private void checkLoggedInStatus() {
    if (((android.text.TextUtils.isEmpty(mCompanyAccount)) || (android.text.TextUtils.isEmpty(com.nicloud.workflowclient.data.data.data.WorkingData.getUserId()))) || (android.text.TextUtils.isEmpty(com.nicloud.workflowclient.data.data.data.WorkingData.getAuthToken()))) {
        showAllViews();
        return ;
    }
    com.nicloud.workflowclient.data.connectserver.worker.CheckLoggedInStatusCommand checkLoggedInStatusCommand = new com.nicloud.workflowclient.data.connectserver.worker.CheckLoggedInStatusCommand(this, this);
    checkLoggedInStatusCommand.execute();
}