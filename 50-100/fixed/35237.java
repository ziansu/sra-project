private void startContainer(java.lang.String idOfContainerToStart, final com.alexecollins.docker.orchestration.Id id) {
    try {
        com.alexecollins.docker.orchestration.StartContainerCmd start = docker.startContainerCmd(idOfContainerToStart);
        start.exec();
    } catch (com.github.dockerjava.api.DockerException e) {
        logger.error(("Unable to start container " + idOfContainerToStart), e);
        throw new com.alexecollins.docker.orchestration.OrchestrationException(e);
    }
}