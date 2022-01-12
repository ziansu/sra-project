private java.lang.String toString(final org.jdom.Element rootElement) {
    final org.jdom.output.XMLOutputter outputter = new org.jdom.output.XMLOutputter();
    outputter.setFormat(org.jdom.output.Format.getCompactFormat());
    final org.jdom.Document document = new org.jdom.Document();
    document.setRootElement(rootElement);
    return outputter.outputString(document);
}