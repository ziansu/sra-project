public void sendRequest() {
    if ((NetworkConnectionHandler.isExecuting) == false) {
        try {
            requestSenderMiddleware.sendRequest();
            in.yousee.theadmin.YouseeCustomActivity.setProgressVisible(this, true);
        } catch (in.yousee.theadmin.model.CustomException e) {
            in.yousee.theadmin.util.LogUtil.print("network not connected exception found");
            promptRetry(e.getErrorMsg());
            e.printStackTrace();
        }
    }else {
        android.widget.Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}