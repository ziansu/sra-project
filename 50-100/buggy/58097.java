protected void setupWorkingDirectory() {
    java.io.File workDir = new java.io.File(((((java.lang.System.getProperty("java.io.tmpdir")) + (java.io.File.separator)) + "workdir-") + (java.lang.System.currentTimeMillis())));
    workDir.mkdirs();
    workDir.deleteOnExit();
    expect(this.syncConfigurationManager.getWorkDirectory()).andReturn(workDir).anyTimes();
}