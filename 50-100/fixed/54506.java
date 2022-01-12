private com.bc.fiduceo.core.UseCaseConfig createUseCaseConfig_AVHRR() throws java.io.IOException {
    final com.bc.fiduceo.core.Sensor primary = new com.bc.fiduceo.core.Sensor("avhrr-n10");
    primary.setPrimary(true);
    return com.bc.fiduceo.core.UseCaseConfigBuilder.build("mmd02").withSensors(java.util.Arrays.asList(primary, new com.bc.fiduceo.core.Sensor("avhrr-n11"))).withDimensions(java.util.Arrays.asList(new com.bc.fiduceo.core.Dimension("avhrr-n10", 5, 5), new com.bc.fiduceo.core.Dimension("avhrr-n11", 5, 5))).withOutputPath(testDir.getAbsolutePath()).createConfig();
}