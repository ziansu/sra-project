@java.lang.Override
public void onItemClicked(long articleId) {
    android.content.Intent intent = new android.content.Intent(getContext(), com.android.casopisinterfon.interfon.activity.ArticleViewActivity.class);
    intent.putExtra(ArticleViewActivity.EXTRA_ARTICLE_ID, articleId);
    intent.putExtra(ArticleViewActivity.EXTRA_ARTICLE_CATEGORY, com.android.casopisinterfon.interfon.model.Category.getCategory(mFragPosition));
    startActivity(intent);
}