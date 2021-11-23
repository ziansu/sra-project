@java.lang.Override
public void onDownLoadCallback(java.lang.String s) {
    if (s == null) {
        showError(model.getThrowable(), true);
        showError(model.getThrowable(), false);
    }else {
        if (isViewAttached()) {
            name.parker.alon.viewerforgithub.view.InfoView infoView = getView();
            infoView.setData(s);
            infoView.showContent();
        }
    }
}