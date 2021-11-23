public java.util.List createArtifactExecutionList(java.lang.String[] provisions, boolean defaultTransitive) throws java.lang.Exception {
    org.universAAL.maven.treebuilder.DependencyTreeBuilder treeBuilder = new org.universAAL.maven.treebuilder.DependencyTreeBuilder(artifactFactory, mavenProjectBuilder, localRepository);
    java.util.List<org.universAAL.maven.treebuilder.ExecutionListCreator.RootNode> rootNodes = parseProvisionsAndBuiltTree(provisions, defaultTransitive, treeBuilder);
    return processTreeIntoFlatList(rootNodes, null);
}