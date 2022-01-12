@java.lang.Override
public void run() {
    java.lang.System.out.println("Heart beat");
    try {
        Protocol.MasterService.SDMasterService masterService = ((Protocol.MasterService.SDMasterService) (registry.lookup(Protocol.MasterService.SDMasterService.class.getCanonicalName())));
        masterService.heartbeat("slave", "localhost", SDDFSConstants.DEFAULT__SLAVE_REGISTRY_PORT, slaveIO.getChunkNumber());
    } catch (java.rmi.RemoteException e) {
        java.lang.System.err.println("master node error");
    } catch (java.rmi.NotBoundException e) {
        java.lang.System.err.println("master service not found");
    }
}