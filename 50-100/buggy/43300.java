@org.junit.BeforeClass
public static void config() throws java.io.IOException {
    if ((com.formulasearchengine.mathosphere.basex.Server.getInstance()) == null) {
        com.formulasearchengine.mathosphere.restd.rest.BaseXResourceTest instance = new com.formulasearchengine.mathosphere.restd.rest.BaseXResourceTest();
        java.io.File f = new java.io.File(instance.getClass().getClassLoader().getResource("sampleHarvest.xml").getFile());
        com.formulasearchengine.mathosphere.basex.Server srv = com.formulasearchengine.mathosphere.basex.Server.getInstance();
        srv.startup(f);
    }
}