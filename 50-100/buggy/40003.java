private java.util.List<java.lang.String> getLinksFromPage(java.lang.String URL, java.lang.String SearchString) throws java.io.IOException {
    java.util.List<java.lang.String> SearchResults = new java.util.ArrayList<java.lang.String>();
    org.jsoup.nodes.Document doc = bsguiloader.Jsoup.connect(URL).followRedirects(true).ignoreHttpErrors(true).timeout(30000).userAgent(userAgent).get();
    org.jsoup.select.Elements Links = doc.select(SearchString);
    for (org.jsoup.nodes.Element Link : Links) {
        SearchResults.add(Link.attr("abs:href"));
    }
    return SearchResults;
}