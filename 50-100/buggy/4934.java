public static void main(java.lang.String[] args) {
    plugin.spatialsimulator.SpatialSimulatorDialog ssd = new plugin.spatialsimulator.SpatialSimulatorDialog();
    org.sbml.jsbml.SBMLDocument document;
    try {
        document = org.sbml.jsbml.JSBML.readSBML("sample/alt.xml");
        java.lang.System.setProperty("jna.debug_load", "true");
        ssd.setDocument(document);
        ssd.setVisible(true);
    } catch (javax.xml.stream.XMLStreamException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}