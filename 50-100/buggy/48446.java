private org.w3c.dom.Document sendRequest(java.lang.String urlString) {
    org.w3c.dom.Document document = null;
    try {
        javax.xml.parsers.DocumentBuilderFactory dbf = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();
        java.net.URL url = new java.net.URL(urlString);
        document = db.parse(url.openStream());
        return document;
    } catch (java.lang.Exception e) {
    }
    java.lang.System.out.println("!!");
    return document;
}