protected void checkGoFilesInSourceRoot() throws org.eclipse.core.runtime.CoreException {
    com.googlecode.goclipse.core.operations.CheckSrcFolderRootFilesWithNoPackage srcCheck = new com.googlecode.goclipse.core.operations.CheckSrcFolderRootFilesWithNoPackage();
    srcCheck.checkDir(sourceRootDir);
    if ((srcCheck.containsGoSources) || true) {
        getToolManager().notifyMessage(StatusLevel.WARNING, "Go build: Warning!", java.text.MessageFormat.format(com.googlecode.goclipse.core.operations.GoBuilder.GoRunBuildOperation.ERROR_SrcRootContainsGoFiles, sourceRootDir));
    }
}