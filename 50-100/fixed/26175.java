private static com.palantir.docker.compose.DockerComposeRule setupDockerComposeIfLocal() {
    if (cloud.benchflow.testmanager.DockerComposeIT.inLocal) {
        java.lang.System.out.println("============== setupDockerComposeIfLocal =====================");
        return cloud.benchflow.testmanager.DockerComposeIT.dockerComposeRule = com.palantir.docker.compose.DockerComposeRule.builder().file(cloud.benchflow.testmanager.DockerComposeIT.LOCAL_DOCKER_COMPOSE_PATH).machine(cloud.benchflow.testmanager.DockerComposeIT.dockerMachine).waitingForService(cloud.benchflow.testmanager.DockerComposeIT.MONGO_NAME, com.palantir.docker.compose.connection.waiting.HealthChecks.toHaveAllPortsOpen()).waitingForService(cloud.benchflow.testmanager.DockerComposeIT.MINIO_NAME, com.palantir.docker.compose.connection.waiting.HealthChecks.toHaveAllPortsOpen()).build();
    }
    return null;
}