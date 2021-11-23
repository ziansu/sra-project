public void setClusterSelectionInternal(final com.orientechnologies.orient.core.metadata.schema.clusterselection.OClusterSelectionStrategy iClusterSelection) {
    if (this.clusterSelection.getClass().equals(iClusterSelection.getClass()))
        return ;
    
    acquireSchemaWriteLock();
    try {
        checkEmbedded();
        this.clusterSelection = iClusterSelection;
    } finally {
        releaseSchemaWriteLock();
    }
}