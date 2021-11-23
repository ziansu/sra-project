public void startDownloads() {
    mLoadingProgressBar.setVisibility(View.VISIBLE);
    vandy.mooc.utils.Utils.hideKeyboard(mActivity.get(), mUrlEditText.getWindowToken());
    if (mUrlList.isEmpty())
        vandy.mooc.utils.Utils.showToast(mActivity.get(), "no images provided");
    else {
        for (java.lang.String urlString : mUrlList)
            startDownload(android.net.Uri.parse(urlString));
        
    }
}