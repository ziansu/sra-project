protected java.lang.String extractType(org.jsoup.nodes.Document doc) {
    return de.jetwick.snacktory.SHelper.innerTrim(doc.select("head meta[property=og:type]").attr("content"));
}