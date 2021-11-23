public static int parsePage(final java.lang.String pageNumber) {
    com.nethergrim.bashorg.db.DB db = com.nethergrim.bashorg.db.DB.getInstance();
    int pn = -1;
    try {
        org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect(((com.nethergrim.bashorg.Constants.URL_BASHORG_PAGE) + pageNumber)).get();
        return com.nethergrim.bashorg.web.BashorgParser.parseDocument(document);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return pn;
}