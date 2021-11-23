java.util.List<java.lang.Object[]> getFromDBForParentKey(java.lang.String wikiName) throws com.xpn.xwiki.XWikiException {
    java.lang.String databaseBefore = getContext().getDatabase();
    try {
        java.util.List<java.lang.Object[]> results = executeSearch(wikiName);
        return results;
    } finally {
        getContext().setDatabase(databaseBefore);
    }
}