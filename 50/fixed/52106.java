public static java.lang.String getTitle(java.lang.String url) throws java.io.IOException {
    org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(url).userAgent(("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 " + "(KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36")).get();
    java.lang.String title = doc.title();
    return title;
}