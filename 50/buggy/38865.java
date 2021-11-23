protected java.lang.String extractType(org.jsoup.nodes.Document doc) {
    java.lang.String type = cleanTitle(doc.title());
    type = de.jetwick.snacktory.SHelper.innerTrim(doc.select("head meta[property=og:type]").attr("content"));
    return type;
}