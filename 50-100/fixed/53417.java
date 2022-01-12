@java.lang.SuppressWarnings(value = "javadoc")
private void flush(org.w3c.dom.Element rootNode) {
    javax.xml.transform.dom.DOMSource ds = new javax.xml.transform.dom.DOMSource(rootNode);
    try {
        javax.xml.transform.stream.StreamResult sr = new javax.xml.transform.stream.StreamResult(out);
        org.jdbdt.Log.XML_TRANSFORMER.transform(ds, sr);
        out.flush();
    } catch (java.lang.Exception e) {
        throw new org.jdbdt.InternalAPIError(e);
    }
}