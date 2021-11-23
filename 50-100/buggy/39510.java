public void finish() {
    internalFinish();
    if (failed) {
        java.nio.file.Path path = report.pathToReport();
        if (path != null) {
            try {
                java.nio.file.Files.deleteIfExists(path);
            } catch (java.io.IOException ex) {
                edu.usu.sdl.openstorefront.report.generator.BaseGenerator.log.log(java.util.logging.Level.WARNING, "Unable to cleanup failed report.", ex);
            }
        }
        throw new edu.usu.sdl.openstorefront.common.exception.OpenStorefrontRuntimeException("The report failed to run.");
    }
}