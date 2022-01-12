private void mergeApplicationResources(java.io.File applicationResources) throws java.io.IOException {
    getLog().debug("Starting ApplicationResources Merge Process");
    org.jaffa.plugins.util.FileFinder appResourcesFinder = new org.jaffa.plugins.util.FileFinder(((("*" + (APPLICATION_RESOURCES)) + "*.") + (PFRAGMENT)));
    java.nio.file.Files.walkFileTree(targetDirectory.toPath(), appResourcesFinder);
    java.util.List<java.nio.file.Path> applicationResourceFragFiles = appResourcesFinder.getFiles();
    mergeFragmentResources(applicationResources, applicationResourceFragFiles, org.jaffa.plugins.APP_RESOURCES_START_TAG, org.jaffa.plugins.APP_RESOURCES_END_TAG);
    getLog().debug("End of ApplicationResources Merge Process");
}