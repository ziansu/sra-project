private java.lang.String getText(java.lang.String url) {
    java.lang.String text = "";
    try {
        org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(url).userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36").get();
        doc.select("a").remove();
        text = doc.text();
    } catch (java.lang.Exception e) {
        return "UNKNOWN_TEXT";
    }
    return text;
}