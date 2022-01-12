public void onProgressChanged(android.webkit.WebView view, int progress) {
    if ((progress < 100) && ((mProgressBar.getVisibility()) == (android.widget.ProgressBar.GONE))) {
        imageStat = 2;
        refresh.setImageResource(R.drawable.icon_cancel);
        mProgressBar.setVisibility(ProgressBar.VISIBLE);
    }
    mProgressBar.setProgress(progress);
    if (progress == 100) {
        imageStat = 1;
        refresh.setImageResource(R.drawable.icon_refresh);
        mProgressBar.setVisibility(ProgressBar.GONE);
    }
}