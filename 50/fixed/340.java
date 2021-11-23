public void serviceRemoved(java.lang.String path, io.fabric8.gateway.ServiceDetails service) {
    getPathMap(path).remove(service);
}