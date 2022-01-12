public java.util.List<com.spotify.docker.client.messages.Container> listContainers() throws com.spotify.docker.client.DockerException {
    java.util.concurrent.Callable<java.util.List<com.spotify.docker.client.messages.Container>> callable = new java.util.concurrent.Callable<java.util.List<com.spotify.docker.client.messages.Container>>() {
        @java.lang.Override
        public java.util.List<com.spotify.docker.client.messages.Container> call() throws java.lang.Exception {
            return dockerClient.listContainers();
        }
    };
    try {
        return callWithTimeout(callable);
    } catch (java.lang.Exception e) {
        throw new com.spotify.docker.client.DockerException(e);
    }
}