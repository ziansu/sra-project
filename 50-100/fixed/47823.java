public static int parsePage(final java.lang.String pageNumber) {
    try {
        org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect(((com.nethergrim.bashorg.Constants.URL_BASHORG_PAGE) + pageNumber)).get();
        return com.nethergrim.bashorg.web.BashorgParser.parseDocument(document);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return -1;
}