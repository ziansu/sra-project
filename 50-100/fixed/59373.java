@java.lang.Override
public void onDownLoadCallback(java.lang.String s) {
    if (s == null)
        showError(model.getThrowable());
    
    if (isViewAttached()) {
        name.parker.alon.viewerforgithub.view.InfoView infoView = getView();
        infoView.setData(s);
        infoView.showContent();
    }
}