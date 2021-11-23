@java.lang.Override
public void OnFalure(java.lang.String msg) {
    if ((mView) == null)
        return ;
    
    isLoading = false;
    android.util.Log.e("tag", ("onFalure    " + msg));
    mView.showMsg(msg);
    mView.hideProgress();
}