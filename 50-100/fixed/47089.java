@java.lang.Override
public void runTest(org.terracotta.passthrough.IClientTestEnvironment env, org.terracotta.passthrough.IClusterControl control) throws java.lang.Throwable {
    int clientIndex = env.getThisClientIndex();
    org.junit.Assert.assertTrue((clientIndex >= 0));
    org.junit.Assert.assertTrue((clientIndex < (org.terracotta.testing.support.SimpleClientStartUpIT.CLIENT_COUNT)));
    org.junit.Assert.assertTrue(((org.terracotta.testing.support.SimpleClientStartUpIT.CLIENT_COUNT) == (env.getTotalClientCount())));
    java.lang.System.out.println(("Running in client: " + clientIndex));
}