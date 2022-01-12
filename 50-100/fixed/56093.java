private org.terracotta.testing.master.ClientRunner[] installTestClients(org.terracotta.testing.master.DebugOptions debugOptions, int clientsToCreate, org.terracotta.testing.master.ClientInstaller clientInstaller) {
    org.terracotta.testing.master.ClientRunner[] testClients = new org.terracotta.testing.master.ClientRunner[clientsToCreate];
    for (int i = 0; i < clientsToCreate; ++i) {
        java.lang.String clientName = "client" + i;
        int debugPort = (0 != (debugOptions.testClientDebugPortStart)) ? (debugOptions.testClientDebugPortStart) + i : 0;
        testClients[i] = clientInstaller.installClient(clientName, "TEST", debugPort, clientsToCreate, i);
    }
    return testClients;
}