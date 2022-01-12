@java.lang.Override
public void runTest(org.terracotta.passthrough.IClientTestEnvironment env, org.terracotta.passthrough.IClusterControl control) throws java.lang.Throwable {
    int clientIndex = env.getThisClientIndex();
    java.lang.System.out.println(("Running client: " + clientIndex));
    if (0 == clientIndex) {
        synchronized(this) {
            wait();
        }
    }else {
        org.junit.Assert.fail();
    }
}