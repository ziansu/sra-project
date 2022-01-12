public void setTargetSiteDirectory(java.io.File targetSiteDirectory) {
    this.targetSiteDirectory = targetSiteDirectory;
    this.outputDirectoryFile = new java.io.File(this.targetSiteDirectory, this.outputDirectory);
}