public static java.lang.String parseString(java.lang.String htmlText) {
    org.jsoup.nodes.Document doc = Jsoup.parse(htmlText);
    return doc.body().text();
}