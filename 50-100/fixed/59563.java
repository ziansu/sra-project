private void mergeComponentsResources(java.io.File components) throws java.io.IOException {
    getLog().debug("Starting Components Merge Process");
    org.jaffa.plugins.util.FileFinder componentDefinitionsResourceFinder = new org.jaffa.plugins.util.FileFinder((((COMPONENT_DEFINITIONS) + "*.") + (XFRAGMENT)));
    java.nio.file.Files.walkFileTree(targetDirectory.toPath(), componentDefinitionsResourceFinder);
    java.util.List<java.nio.file.Path> componentTilesDefinitionsResourceFragFiles = componentDefinitionsResourceFinder.getFiles();
    mergeFragmentResources(components, componentTilesDefinitionsResourceFragFiles, org.jaffa.plugins.COMPONENTS_START_TAG, org.jaffa.plugins.COMPONENTS_END_TAG);
    getLog().debug("End of Components Merge Process");
}