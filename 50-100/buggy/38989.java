private java.util.List<java.lang.String> convertKeywords(org.jsoup.select.Elements keywordsElements) {
    java.util.List<java.lang.String> keywords = new java.util.ArrayList<java.lang.String>();
    for (org.jsoup.nodes.Element e : keywordsElements) {
        keywords.add(e.attr("content"));
    }
    return keywords;
}