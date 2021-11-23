@java.lang.Override
public void runTest(org.terracotta.passthrough.IClientTestEnvironment env, org.terracotta.passthrough.IClusterControl control, org.terracotta.connection.Connection connection) throws java.lang.Throwable {
    int clientIndex = env.getThisClientIndex();
    java.lang.System.out.println(("Running in client: " + clientIndex));
}