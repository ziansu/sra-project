public static int canBeRecommended(java.lang.String userId) {
    java.lang.String url = RecommendationConfig.cookBooksUrl.replace("${userId}", userId).replace("${page}", "1");
    org.jsoup.nodes.Document doc = com.sicnu.yudidi.crawler.CrawlerNoCookie.getPageContent(url, "get");
    org.jsoup.select.Elements trs = doc.select(".module-body tbody tr");
    return trs.size();
}