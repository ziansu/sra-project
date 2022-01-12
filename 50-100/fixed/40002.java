public com.vmware.vim25.ws.UpdateSet waitForUpdates(com.vmware.vim25.ws.ManagedObjectReference _this, java.lang.String version) throws com.vmware.vim25.ws.InvalidCollectorVersion, com.vmware.vim25.ws.RuntimeFault, java.rmi.RemoteException {
    com.vmware.vim25.ws.Argument[] paras = new com.vmware.vim25.ws.Argument[2];
    paras[0] = new com.vmware.vim25.ws.Argument("_this", "ManagedObjectReference", _this);
    paras[1] = new com.vmware.vim25.ws.Argument("version", "String", version);
    return ((com.vmware.vim25.ws.UpdateSet) (wsc.invoke("WaitForUpdates", paras, "UpdateSet", true)));
}