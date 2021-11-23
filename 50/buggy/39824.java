private java.lang.String getWikiName(java.lang.String parentKey, com.xpn.xwiki.XWikiContext context) {
    java.lang.String wikiName = context.getDatabase();
    if (parentKey.contains(":")) {
        wikiName = parentKey.split(":", 2)[0];
    }
    return wikiName;
}