@java.lang.Override
public void loadInformation() {
    getView().showLoading(false);
    model.retrieveInfo(new name.parker.alon.viewerforgithub.model.MyAction<java.lang.String>() {
        @java.lang.Override
        public void onDownLoadCallback(java.lang.String s) {
            if (s == null) {
                showError(model.getThrowable());
            }else {
                if (isViewAttached()) {
                    name.parker.alon.viewerforgithub.view.InfoView infoView = getView();
                    infoView.setData(s);
                    infoView.showContent();
                }
            }
        }
    });
}