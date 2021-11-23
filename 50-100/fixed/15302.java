private void debugMyNode(org.w3c.dom.Node inNode, java.lang.String fileName) {
    try (java.io.FileOutputStream output = new java.io.FileOutputStream(fileName)) {
        org.jdom.output.XMLOutputter outputter = new org.jdom.output.XMLOutputter();
        org.jdom.Document tempDoc = new org.jdom.input.DOMBuilder().build(inNode.getOwnerDocument());
        outputter.output(tempDoc.getRootElement(), output);
    } catch (java.io.FileNotFoundException e) {
        org.goobi.production.plugin.CataloguePlugin.PicaPlugin.ConfigOpacCatalogue.myLogger.error("debugMyNode(Node, String)", e);
    } catch (java.io.IOException e) {
        org.goobi.production.plugin.CataloguePlugin.PicaPlugin.ConfigOpacCatalogue.myLogger.error("debugMyNode(Node, String)", e);
    }
}