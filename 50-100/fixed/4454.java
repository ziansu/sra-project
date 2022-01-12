private boolean checkLangAttribute() {
    try {
        org.jsoup.nodes.Element htmlTag = doc.getElementsByTag("html").first();
        java.lang.String lang = htmlTag.attr("lang");
        if ((lang != null) && (!(lang.equals("")))) {
            return !((lang.startsWith("en")) || (lang.equals("mul")));
        }else {
            return false;
        }
    } catch (java.lang.NullPointerException e) {
        return false;
    }
}