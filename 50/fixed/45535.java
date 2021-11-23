public void addLink(final java.lang.String sourceWikiPageId, final java.lang.String targetWikiPageId) {
    linksFromPage.put(sourceWikiPageId, targetWikiPageId);
    linksToPage.put(targetWikiPageId, sourceWikiPageId);
}