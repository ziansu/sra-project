public int updateSavedArticleState(xyz.klinker.android.article.data.Article article) {
    android.content.ContentValues values = new android.content.ContentValues(1);
    values.put(ArticleModel.COLUMN_SAVED, article.saved);
    return database.update(ArticleModel.TABLE, values, "_id=?", new java.lang.String[]{ java.lang.Long.toString(article.id) });
}