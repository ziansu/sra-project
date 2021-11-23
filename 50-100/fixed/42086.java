public static java.lang.String getBlogTitle(java.lang.String html) {
    if (android.text.TextUtils.isEmpty(html)) {
        return null;
    }
    try {
        org.jsoup.nodes.Element titleElement = org.jsoup.Jsoup.parse(html).getElementsByClass("article_title").get(0);
        return titleElement.select("h1").select("span").select("a").text();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}