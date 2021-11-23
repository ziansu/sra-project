private void init() {
    java.lang.String id = getIntent().getStringExtra(com.playcode.mvpdemo.ui.activity.ArticleActivity.ARTICLE_ID);
    mWebView = ((android.webkit.WebView) (findViewById(R.id.wv_article)));
    new com.playcode.mvpdemo.presenter.ArticlePresenter(this);
    mPresenter.attachView();
    mPresenter.getArticleDetail(id);
    android.webkit.WebSettings settings = mWebView.getSettings();
    settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
    settings.setBuiltInZoomControls(false);
    settings.setSupportZoom(false);
}