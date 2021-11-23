public static void loadDefaultSettignsFile() {
    try {
        java.io.File xmlFile = new java.io.File(util.Settings.defaultFile);
        javax.xml.parsers.DocumentBuilderFactory dbFactory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        javax.xml.parsers.DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        util.Settings.doc = dBuilder.parse(xmlFile);
        util.Settings.doc.getDocumentElement().normalize();
    } catch (java.lang.Exception e) {
        return ;
    }
}