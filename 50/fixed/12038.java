private static void mapTreeNameToConfiguration() {
    karob.bigtrees.KTreeCfgTrees.treeNameToConfiguration = new java.util.HashMap<java.lang.String, karob.bigtrees.config.TreeConfiguration>();
    for (karob.bigtrees.config.TreeConfiguration treeConfiguration : karob.bigtrees.KTreeCfgTrees.treeConfigurations) {
        karob.bigtrees.KTreeCfgTrees.treeNameToConfiguration.put(treeConfiguration.getName().toLowerCase(), treeConfiguration);
    }
}