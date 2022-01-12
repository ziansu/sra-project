public static void saveDocAsXML(org.w3c.dom.Document doc, java.lang.String filename) {
    try {
        javax.xml.transform.Transformer transformer = javax.xml.transform.TransformerFactory.newInstance().newTransformer();
        javax.xml.transform.Result output = new javax.xml.transform.stream.StreamResult(new java.io.File(filename));
        javax.xml.transform.Source input = new javax.xml.transform.dom.DOMSource(doc);
        transformer.transform(input, output);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}