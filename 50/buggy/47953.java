public org.m2latex.mojo.Settings setTargetSiteDirectory(java.io.File targetSiteDirectory) {
    this.targetSiteDirectory = targetSiteDirectory;
    this.outputDirectoryFile = new java.io.File(this.targetSiteDirectory, this.outputDirectory);
    return this;
}