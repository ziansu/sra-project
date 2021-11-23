public void setClusterSelectionInternal(final com.orientechnologies.orient.core.metadata.schema.clusterselection.OClusterSelectionStrategy iClusterSelection) {
    if (this.clusterSelection.getName().equals(iClusterSelection.getName()))
        return ;
    
    acquireSchemaWriteLock();
    try {
        checkEmbedded();
        this.clusterSelection = iClusterSelection;
    } finally {
        releaseSchemaWriteLock();
    }
}