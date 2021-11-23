public void startArticle(android.view.View view) {
    android.widget.Toast.makeText(view.getContext(), java.lang.String.format(openingArticleText, titleView.getText().toString()), Toast.LENGTH_SHORT).show();
    MinimalWebViewActivity.Builder.create(getContext()).setUrl(articleUrl).setNoCaret().setWebTipShare().startActivity();
}