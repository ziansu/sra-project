private void updateMatchesString() {
    java.lang.String template = mBrowserActivity.getResources().getQuantityString(R.plurals.matches_found, mNumberOfMatches, ((mWebView.findIndex()) + 1), mNumberOfMatches);
    mMatches.setText(template);
}