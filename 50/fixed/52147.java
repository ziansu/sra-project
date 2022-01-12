@java.lang.Override
public java.lang.Void run() throws java.lang.Exception {
    final ca.nrc.cadc.vos.client.ClientRecursiveSetNode rj = voSpaceClient.setNodeRecursive(newNode);
    rj.setMonitor(false);
    rj.run();
    return null;
}