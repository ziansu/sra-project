public void loadDocument() {
    try {
        java.util.List<org.orbisgis.mapcomposer.model.graphicalelement.interfaces.GraphicalElement> list = saveNLoadHandler.loadProject();
        if (list != null) {
            mainController.removeAllGE();
            for (int i = (list.size()) - 1; i >= 0; i--)
                mainController.addGE(list.get(i));
            
        }
    } catch (javax.xml.parsers.ParserConfigurationException | org.xml.sax.SAXException | java.io.IOException ex) {
        org.slf4j.LoggerFactory.getLogger(org.orbisgis.mapcomposer.controller.MainController.class).error(ex.getMessage());
    }
}