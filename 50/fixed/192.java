public void loadWikiHtml(java.lang.String wikiHtml) {
    com.jtmcn.archwiki.viewer.WikiClient.wrWeb.get().loadDataWithBaseURL(com.jtmcn.archwiki.viewer.Constants.ARCHWIKI_BASE, wikiHtml, com.jtmcn.archwiki.viewer.Constants.TEXT_HTML_MIME, com.jtmcn.archwiki.viewer.Constants.UTF_8, null);
}