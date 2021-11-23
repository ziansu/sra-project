private org.w3c.dom.Document readDocument(java.lang.String in_file) {
    doc_builder = createDocBuilder();
    org.w3c.dom.Document in_doc = null;
    try {
        in_doc = doc_builder.parse(new java.io.File(in_file));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return in_doc;
}