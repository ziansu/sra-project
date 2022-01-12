@org.testng.annotations.AfterClass
public void tearDown() throws java.lang.Exception {
    org.apache.atlas.typesystem.types.TypeSystem.getInstance().reset();
    try {
        graphProvider.get().shutdown();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    try {
        com.thinkaurelius.titan.core.util.TitanCleanup.clear(graphProvider.get());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}