@org.testng.annotations.Test
public void testPathsFromProtectingInBackground() throws java.lang.Exception {
    for (org.apache.zookeeper.CreateMode mode : org.apache.zookeeper.CreateMode.values()) {
        java.lang.System.out.println(mode);
        internalTestPathsFromProtectingInBackground(mode);
    }
}