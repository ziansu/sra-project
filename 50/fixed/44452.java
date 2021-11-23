@java.lang.Override
protected boolean register(org.opendaylight.vtn.manager.internal.VTNManagerImpl mgr) throws org.opendaylight.vtn.manager.VTNException {
    return this.register(mgr, new org.opendaylight.vtn.manager.internal.cluster.MacMapImpl.UpdateAllowedContext(), this);
}