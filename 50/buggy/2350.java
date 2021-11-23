public java.lang.String getSearchResultSummaryText(org.jsoup.nodes.Document document) {
    org.jsoup.nodes.Element totalCount = document.select("div.s-first-column").first();
    java.lang.System.out.println(("summary text is:" + (totalCount.text())));
    return totalCount.text();
}