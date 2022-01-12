public void pull(final java.lang.String imageName) throws com.spotify.docker.client.DockerException {
    java.util.concurrent.Callable<java.lang.Void> callable = new java.util.concurrent.Callable<java.lang.Void>() {
        @java.lang.Override
        public java.lang.Void call() throws java.lang.Exception {
            dockerClient.pull(imageName);
            return null;
        }
    };
    try {
        callWithTimeout(callable);
    } catch (java.lang.Exception e) {
        com.hubspot.singularity.executor.utils.DockerUtils.LOG.error("Could not pull image due to error", e);
        throw new com.spotify.docker.client.DockerException(e);
    }
}