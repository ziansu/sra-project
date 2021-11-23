private org.jsoup.nodes.Document Connect(java.lang.String cim) throws java.io.IOException {
    java.lang.System.setProperty("http.proxyHost", "proxy.vekoll.uni-pannon.hu");
    java.lang.System.setProperty("http.proxyPort", "3128");
    final org.jsoup.nodes.Document document;
    document = org.jsoup.Jsoup.connect(cim).get();
    return document;
}