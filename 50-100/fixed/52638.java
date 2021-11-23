public void loadDocument(java.lang.String filePath) {
    try {
        java.io.File file = new java.io.File(filePath);
        javax.xml.parsers.DocumentBuilderFactory dbFactory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        javax.xml.parsers.DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        document = dBuilder.parse(file);
        document.getDocumentElement().normalize();
    } catch (java.lang.Exception e) {
    }
}