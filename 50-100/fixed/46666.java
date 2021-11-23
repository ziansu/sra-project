public void copyUploadedAppToLocation(java.lang.String uploadedFileName, java.lang.String workingDirectory) throws java.io.IOException {
    java.io.File sourceFile = new java.io.File((((getUploadedApplicationTmpPath()) + (java.io.File.separator)) + uploadedFileName));
    copyUploadedAppToRepositoryLocation(sourceFile, uploadedFileName, workingDirectory);
    copyUplodedAppToDepolyArtifactLocation(sourceFile, uploadedFileName, workingDirectory);
    org.apache.commons.io.FileUtils.forceDelete(sourceFile);
}