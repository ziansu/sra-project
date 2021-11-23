public org.m2latex.mojo.Settings setTempDirectory(java.lang.String tempDirectory) {
    this.tempDirectory = tempDirectory;
    this.tempDirectoryFile = new java.io.File(this.targetDirectory, this.tempDirectory);
    return this;
}