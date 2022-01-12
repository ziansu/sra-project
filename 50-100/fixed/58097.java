protected void setupWorkingDirectory() {
    this.workDir = new java.io.File(((((java.lang.System.getProperty("java.io.tmpdir")) + (java.io.File.separator)) + "workdir-") + (java.lang.System.currentTimeMillis())));
    this.workDir.mkdirs();
    this.workDir.deleteOnExit();
    expect(this.syncConfigurationManager.getWorkDirectory()).andReturn(this.workDir).anyTimes();
}