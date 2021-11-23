@java.lang.Override
public java.util.List<edu.grinnell.sandb.Model.Article> getNextPage(java.lang.String category, int currentPageNumber, int lastArticleId) {
    updateLocalCache();
    return localClient.getNextPage(category, currentPageNumber, lastArticleId);
}