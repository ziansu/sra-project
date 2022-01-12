private org.jsoup.nodes.Document Connect(java.lang.String cim) throws java.io.IOException {
    final org.jsoup.nodes.Document document;
    document = org.jsoup.Jsoup.connect(cim).get();
    return document;
}