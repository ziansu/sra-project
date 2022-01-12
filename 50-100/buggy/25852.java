@org.testng.annotations.AfterClass
public void tearDown() throws java.lang.Exception {
    org.apache.atlas.typesystem.types.TypeSystem.getInstance().reset();
    graphProvider.get().shutdown();
    try {
        com.thinkaurelius.titan.core.util.TitanCleanup.clear(graphProvider.get());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}