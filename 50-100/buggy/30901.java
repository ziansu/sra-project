public com.spotify.docker.client.messages.ContainerInfo inspectContainer(final java.lang.String containerName) throws com.spotify.docker.client.DockerException {
    java.util.concurrent.Callable<com.spotify.docker.client.messages.ContainerInfo> callable = new java.util.concurrent.Callable<com.spotify.docker.client.messages.ContainerInfo>() {
        @java.lang.Override
        public com.spotify.docker.client.messages.ContainerInfo call() throws java.lang.Exception {
            return dockerClient.inspectContainer(containerName);
        }
    };
    try {
        return callWithTimeout(callable);
    } catch (java.lang.Exception e) {
        com.hubspot.singularity.executor.utils.DockerUtils.LOG.error("Caught exception while getting container status", e);
        throw new com.spotify.docker.client.DockerException(e);
    }
}