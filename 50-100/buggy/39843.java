java.util.List<java.lang.Object[]> getFromDBForParentKey(java.lang.String wikiName, com.xpn.xwiki.XWikiContext context) throws com.xpn.xwiki.XWikiException {
    java.lang.String databaseBefore = context.getDatabase();
    java.util.List<java.lang.Object[]> results = executeSearch(wikiName, context);
    context.setDatabase(databaseBefore);
    return results;
}