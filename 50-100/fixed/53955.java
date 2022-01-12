private static com.palantir.docker.compose.connection.DockerMachine setupDockerMachineIfLocal() {
    if (cloud.benchflow.testmanager.DockerComposeIT.inLocal) {
        java.lang.System.out.println("============== setupDockerMachineIfLocal =====================");
        return com.palantir.docker.compose.connection.DockerMachine.localMachine().withAdditionalEnvironmentVariable("MONGO_TAG", cloud.benchflow.testmanager.DockerComposeIT.MONGO_TAG).withAdditionalEnvironmentVariable("MONGO_DATA_VOLUME", cloud.benchflow.testmanager.DockerComposeIT.MONGO_DATA_VOLUME_PATH).withAdditionalEnvironmentVariable("MINIO_TAG", cloud.benchflow.testmanager.DockerComposeIT.MINIO_TAG).withAdditionalEnvironmentVariable("MINIO_ACCESS_KEY", cloud.benchflow.testmanager.DockerComposeIT.MINIO_ACCESS_KEY).withAdditionalEnvironmentVariable("MINIO_SECRET_KEY", cloud.benchflow.testmanager.DockerComposeIT.MINIO_SECRET_KEY).build();
    }
    return null;
}