private com.owo.news.ui.ArticleItemView obtainArticleImageView(android.content.Context context, int position) {
    com.owo.news.ui.ArticleItemView itemView = new com.owo.news.ui.ArticleItemView(context);
    itemView.setData(mArticles.get(position), mImageLoader);
    return itemView;
}