@org.junit.BeforeClass
public static void setup() throws java.lang.Exception {
    final java.net.URL fname = com.formulasearchengine.mathosphere.basex.BaseXTestSuite.class.getClassLoader().getResource("sampleHarvest.xml");
    java.io.File file = new java.io.File(fname.toURI());
    com.formulasearchengine.mathosphere.basex.Server srv = com.formulasearchengine.mathosphere.basex.Server.getInstance();
    srv.startup(file);
}