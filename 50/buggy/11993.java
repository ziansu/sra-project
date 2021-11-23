public boolean isNewsArticlesTableEmpty(android.database.sqlite.SQLiteDatabase database) {
    long numberOFArticles = this.getNumberOfNewsArticles(database);
    return (this.getNumberOfNewsArticles(database)) == 0;
}