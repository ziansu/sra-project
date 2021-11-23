private boolean directoryDoesExist(java.lang.String dirName) throws de.uniulm.omi.cloudiator.lance.lca.registry.RegistrationException {
    try {
        mousio.etcd4j.responses.EtcdKeysResponse response = etcd.getDir(dirName).send().get();
        return response != null;
    } catch (java.io.IOException ioe) {
        throw new de.uniulm.omi.cloudiator.lance.lca.registry.RegistrationException(ioe);
    } catch (java.util.concurrent.TimeoutException e) {
        throw new de.uniulm.omi.cloudiator.lance.lca.registry.RegistrationException(e);
    } catch (mousio.etcd4j.responses.EtcdException e) {
        if ((e.errorCode) == 100)
            return false;
        
        throw new de.uniulm.omi.cloudiator.lance.lca.registry.RegistrationException(e);
    }
}