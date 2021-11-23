public void startDownloads() {
    vandy.mooc.utils.Utils.hideKeyboard(mActivity.get(), mUrlEditText.getWindowToken());
    if (mUrlList.isEmpty())
        vandy.mooc.utils.Utils.showToast(mActivity.get(), "no images provided");
    else {
        mLoadingProgressBar.setVisibility(View.VISIBLE);
        for (java.lang.String urlString : mUrlList)
            startDownload(android.net.Uri.parse(urlString));
        
    }
}