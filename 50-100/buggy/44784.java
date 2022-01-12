protected void retrieveImages(java.lang.String search) {
    mTableLayout.removeAllViews();
    mProgress = new android.app.ProgressDialog(this);
    mProgress.setMessage("Finding Images...");
    mProgress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    mProgress.setIndeterminate(true);
    mProgress.setCanceledOnTouchOutside(false);
    mProgress.show();
    if (null == search) {
        retrieveImages(search);
        return ;
    }
    seth.imagebrowser.api.ApiUtils.getImgurService().searchGallery(search, this);
}