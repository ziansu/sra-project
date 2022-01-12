public static void writeDOMHTML(java.io.InputStream inputStream, org.jdom2.Document document, java.lang.String path) throws java.io.IOException, javax.xml.transform.TransformerException {
    org.jdom2.transform.JDOMResult out = new org.jdom2.transform.JDOMResult();
    javax.xml.transform.Transformer tf;
    tf = javax.xml.transform.TransformerFactory.newInstance().newTransformer(new javax.xml.transform.stream.StreamSource(inputStream));
    tf.transform(new org.jdom2.transform.JDOMSource(document), out);
    de.hs.inform.lyuz.cookbook.utils.FilesUtils.writeDOMXML(out.getDocument(), new java.io.FileWriter(path));
}