private java.lang.String parsePicture(java.lang.String desc) {
    java.lang.String src = null;
    if (desc.contains("img")) {
        org.jsoup.nodes.Document document = org.jsoup.Jsoup.parse(desc);
        org.jsoup.nodes.Element img = document.select("img").first();
        if (desc.contains("src")) {
            src = img.attr("src");
        }
    }
    return src;
}