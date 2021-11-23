@java.lang.Override
public void onNewIntent(android.content.Intent intent) {
    java.lang.String url = intent.getStringExtra(DetailActivity.EXTRA_URL);
    if ((url != null) && (!(url.isEmpty()))) {
        mTitle = intent.getStringExtra(DetailActivity.EXTRA_TITLE);
        mView.setWebViewContent("<html></html>");
        mView.showMovieTitle(mTitle);
        loadContent(url);
    }
}