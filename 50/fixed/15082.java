public void removeDockerMonitor(java.lang.String containerId) {
    containerIdToDM.remove(containerId);
    tracer.removeContainerLogReader(containerId);
}