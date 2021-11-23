@java.lang.Override
public boolean applicationComponentExists(de.uniulm.omi.cloudiator.lance.application.ApplicationInstanceId appInstId) throws de.uniulm.omi.cloudiator.lance.lca.registry.RegistrationException {
    try {
        return delegate.applicationInstanceExists(appInstId);
    } catch (java.rmi.RemoteException re) {
        throw new de.uniulm.omi.cloudiator.lance.lca.registry.RegistrationException("operation failed.", re);
    }
}