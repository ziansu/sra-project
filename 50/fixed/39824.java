private java.lang.String getWikiName(java.lang.String parentKey) {
    java.lang.String wikiName = getContext().getDatabase();
    if (parentKey.contains(":")) {
        wikiName = parentKey.split(":", 2)[0];
    }
    return wikiName;
}