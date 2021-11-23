java.lang.String doPullImages(de.uniulm.omi.cloudiator.lance.lca.container.ComponentInstanceId myId) throws de.uniulm.omi.cloudiator.lance.lca.containers.docker.connector.DockerException {
    java.lang.String result = searchImageInLocalCache();
    if (result == null) {
        result = getImageFromPrivateRepository();
        if (result != null) {
            result = getImageFromDefaultLocation();
        }
    }
    if (result != null)
        return result;
    
    throw new de.uniulm.omi.cloudiator.lance.lca.containers.docker.connector.DockerException(("cannot pull image: " + myId));
}