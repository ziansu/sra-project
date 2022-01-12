private static org.w3c.dom.Document parseDocument(java.io.InputStream ins) throws java.lang.Exception {
    org.w3c.dom.Document doc = null;
    try {
        doc = net.wasdev.wlp.gradle.plugins.utils.ServerConfigDocument.getDocumentBuilder().parse(ins);
    } catch (java.lang.Exception e) {
        throw e;
    } finally {
        if (ins != null) {
            ins.close();
        }
    }
    return doc;
}