private java.lang.String toString(org.jdom.Element rootElement) {
    java.lang.String xml = null;
    org.jdom.Document document = new org.jdom.Document();
    document.setRootElement(rootElement);
    try {
        org.jdom.output.XMLOutputter outputter = new org.jdom.output.XMLOutputter();
        outputter.setFormat(org.jdom.output.Format.getCompactFormat());
        xml = outputter.outputString(document);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return xml;
}