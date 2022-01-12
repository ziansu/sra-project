public void onCtrlClick(java.lang.String url, boolean stopOrAuto) {
    txtProgress.setVisibility(View.VISIBLE);
    progressBarCircle.setVisibility(View.VISIBLE);
    webCtrlView.loadUrl(url);
    this.stopOrAuto = stopOrAuto;
}