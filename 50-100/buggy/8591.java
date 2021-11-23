@org.junit.Before
public void init() throws java.io.IOException, java.lang.InterruptedException, java.sql.SQLException {
    if (!(org.maxgamer.rs.TitanTest.initialized)) {
        org.maxgamer.rs.TitanTest.initialized = true;
        org.maxgamer.rs.core.Core.start();
        while ((org.maxgamer.rs.core.Core.getServer().getTicks()) <= 0) {
            java.lang.Thread.sleep(10);
        } 
    }
}