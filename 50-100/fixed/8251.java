private org.jdom.Element getFullConfigElement(java.lang.String filename) {
    org.jdom.input.SAXBuilder builder = new org.jdom.input.SAXBuilder();
    builder.setIgnoringElementContentWhitespace(true);
    try {
        org.jdom.Document doc = builder.build(filename);
        return doc.getRootElement();
    } catch (org.jdom.JDOMException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}