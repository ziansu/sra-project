@java.lang.Override
public void disconnectFromNetwork(java.lang.String containerId, java.lang.String networkId) throws com.spotify.docker.client.exceptions.DockerException, java.lang.InterruptedException {
    disconnectFromNetwork(containerId, networkId, false);
}