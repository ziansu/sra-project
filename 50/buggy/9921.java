@java.lang.Override
public void onReceivedError(android.webkit.WebView view, int errorCode, java.lang.String description, java.lang.String failingUrl) {
    didReceiveError = true;
    hideLoadingProgress();
    pageIsLoaded = false;
    ViewPagerDownloadManager.instance.done(this, false);
    showErrorMessage(R.string.network_error_message, FontAwesomeIcons.fa_exclamation_circle);
}