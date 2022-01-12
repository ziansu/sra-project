private static org.openbase.bco.dal.remote.service.AbstractServiceRemote instantiatServiceRemote(final java.lang.Class<? extends org.openbase.bco.dal.remote.service.AbstractServiceRemote> serviceRemoteClass) throws org.openbase.jul.exception.InstantiationException {
    try {
        org.openbase.bco.dal.remote.service.AbstractServiceRemote remote = serviceRemoteClass.newInstance();
        return remote;
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException ex) {
        throw new java.lang.InstantiationException(serviceRemoteClass, ex);
    }
}