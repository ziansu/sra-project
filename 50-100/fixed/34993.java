private void mergeDwrResources(java.io.File dwr) throws java.io.IOException {
    getLog().debug("Starting ApplicationResources Merge Process");
    org.jaffa.plugins.util.FileFinder dwrResourcesFinder = new org.jaffa.plugins.util.FileFinder((((DWR) + "*.") + (XFRAGMENT)));
    java.nio.file.Files.walkFileTree(targetDirectory.toPath(), dwrResourcesFinder);
    java.util.List<java.nio.file.Path> dwrResourceFragFiles = dwrResourcesFinder.getFiles();
    mergeFragmentResources(dwr, dwrResourceFragFiles, org.jaffa.plugins.DWR_START_TAG, org.jaffa.plugins.DWR_END_TAG, getSkipTagForConfigFilesList().contains(org.jaffa.plugins.DWR), true);
    getLog().debug("End of ApplicationResources Merge Process");
}