@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    this.isFinish = false;
    if (isShowDialog) {
        if (com.ryan.apihandler.utils.Utils.isNetworkOK(activity)) {
            dialog.show();
            listener.onPrepare();
        }else {
            com.ryan.apihandler.utils.Utils.showNoNetDialog(activity);
        }
    }
}