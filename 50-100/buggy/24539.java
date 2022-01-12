@java.lang.Override
protected void onCancelled() {
    super.onCancelled();
    if (dialog.isShowing())
        dialog.dismiss();
    
    this.isFinish = true;
    listener.onFailure();
    if (isShowDialog)
        com.ryan.apihandler.utils.Utils.showSorry2Wait(this.activity);
    
}