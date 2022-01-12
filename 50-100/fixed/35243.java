public java.lang.String prepareCertDir(java.lang.Long stackId) throws com.sequenceiq.cloudbreak.core.CloudbreakSecuritySetupException {
    java.nio.file.Path stackCertDir = java.nio.file.Paths.get(getCertDir(stackId));
    if (!(java.nio.file.Files.exists(stackCertDir))) {
        try {
            com.sequenceiq.cloudbreak.service.SimpleSecurityService.LOGGER.info("Creating directory for the keys and certificates under {}", certDir);
            java.nio.file.Files.createDirectories(stackCertDir);
            prepareFiles(stackId);
        } catch (java.io.IOException | java.lang.SecurityException se) {
            throw new com.sequenceiq.cloudbreak.core.CloudbreakSecuritySetupException(("Failed to create directory: " + stackCertDir));
        }
    }else {
        prepareFiles(stackId);
    }
    return stackCertDir.toString();
}