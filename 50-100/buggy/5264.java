public void removeContainer(final java.lang.String containerId, final boolean removeRunning) throws com.spotify.docker.client.DockerException {
    java.util.concurrent.Callable<java.lang.Void> callable = new java.util.concurrent.Callable<java.lang.Void>() {
        @java.lang.Override
        public java.lang.Void call() throws java.lang.Exception {
            dockerClient.removeContainer(containerId, removeRunning);
            return null;
        }
    };
    try {
        callWithTimeout(callable);
    } catch (java.lang.Exception e) {
        com.hubspot.singularity.executor.utils.DockerUtils.LOG.error("Caught exception attempting to stop container", e);
        throw new com.spotify.docker.client.DockerException(e);
    }
}