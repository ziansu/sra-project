public boolean isNewsArticlesTableEmpty(android.database.sqlite.SQLiteDatabase database) {
    return (this.getNumberOfNewsArticles(database)) == 0;
}