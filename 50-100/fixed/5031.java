@org.junit.Test
public void testParseModelConstants() {
    java.lang.String path = (UNIT_BASEDIR) + "const_model/";
    try {
        com.verivital.hyst.junit.ModelParserTest.flatten(com.verivital.hyst.importer.SpaceExImporter.importModels((path + "const_model.cfg"), (path + "const_model.xml")));
        org.junit.Assert.fail("Exception expected due to undefined constant param in network component");
    } catch (com.verivital.hyst.ir.AutomatonExportException e) {
    }
}