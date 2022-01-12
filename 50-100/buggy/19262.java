@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    this.isFinish = false;
    if (com.ryan.apihandler.utils.Utils.isNetworkOK(activity)) {
        if (isShowDialog)
            dialog.show();
        
        listener.onPrepare();
    }else {
        if (isShowDialog)
            com.ryan.apihandler.utils.Utils.showNoNetDialog(activity);
        
    }
}