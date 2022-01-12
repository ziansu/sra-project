public java.lang.String getSearchResultSummaryText(org.jsoup.nodes.Document document) {
    org.jsoup.nodes.Element totalCount = document.select("div.s-first-column").first();
    return totalCount.text();
}