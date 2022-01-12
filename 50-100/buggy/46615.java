private org.jsoup.nodes.Document getDoc() throws java.io.IOException {
    java.lang.String login = ((config.userName) + ":") + (config.password);
    java.lang.String base64login = new java.lang.String(java.util.Base64.getEncoder().encode(login.getBytes()));
    org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(config.url).header("Authorization", ("Basic " + base64login)).get();
    return doc;
}