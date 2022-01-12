private java.lang.String getXmlString(net.sourceforge.pmd.lang.ast.Node node) throws javax.xml.transform.TransformerException {
    java.io.StringWriter writer = new java.io.StringWriter();
    javax.xml.transform.Source source = new javax.xml.transform.dom.DOMSource(node.getAsDocument());
    javax.xml.transform.Result result = new javax.xml.transform.stream.StreamResult(writer);
    javax.xml.transform.TransformerFactory transformerFactory = javax.xml.transform.TransformerFactory.newInstance();
    transformerFactory.setAttribute("indent-number", 3);
    javax.xml.transform.Transformer xformer = transformerFactory.newTransformer();
    xformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
    xformer.transform(source, result);
    return writer.toString();
}