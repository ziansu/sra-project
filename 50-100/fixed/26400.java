private void crawle(java.lang.String url, java.util.Set<java.lang.String> set, java.lang.String content) {
    org.jsoup.nodes.Document parse = org.jsoup.Jsoup.parse(content);
    org.jsoup.select.Elements aElements = parse.select("a[href]");
    for (org.jsoup.nodes.Element element : aElements) {
        java.lang.String cleanUrl = getCleanUrl(url, element);
        if ((cleanUrl != null) && (cleanUrl.startsWith(baseUrl))) {
            set.add(cleanUrl);
        }
    }
}