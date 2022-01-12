static org.sleuthkit.autopsy.keywordsearch.Index findLatestVersionIndexDir(java.util.List<org.sleuthkit.autopsy.keywordsearch.Index> allIndexes) {
    java.lang.String indexFolderName = (("solr" + (org.sleuthkit.autopsy.keywordsearch.IndexFinder.CURRENT_SOLR_VERSION)) + "_schema_") + (org.sleuthkit.autopsy.keywordsearch.IndexFinder.CURRENT_SOLR_SCHEMA_VERSION);
    for (org.sleuthkit.autopsy.keywordsearch.Index index : allIndexes) {
        java.lang.String path = index.getIndexPath();
        if (path.contains(indexFolderName)) {
            return new org.sleuthkit.autopsy.keywordsearch.Index(path, org.sleuthkit.autopsy.keywordsearch.IndexFinder.CURRENT_SOLR_VERSION, org.sleuthkit.autopsy.keywordsearch.IndexFinder.CURRENT_SOLR_SCHEMA_VERSION);
        }
    }
    return new org.sleuthkit.autopsy.keywordsearch.Index();
}