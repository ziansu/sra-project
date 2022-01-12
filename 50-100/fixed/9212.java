@java.lang.Override
public boolean apply(final org.pentaho.agilebi.modeler.ModelerWorkspace workspace, final java.lang.String field, final org.pentaho.metastore.api.IMetaStore metaStore) throws org.pentaho.agilebi.modeler.ModelerException {
    org.pentaho.agilebi.modeler.nodes.LevelMetaData existingLevel = locateLevelFromFormula(workspace, field);
    boolean isApplied = false;
    if ((existingLevel != null) && (workspace != null)) {
        removeLevel(workspace, existingLevel);
        workspace.getWorkspaceHelper().populateDomain(workspace);
        isApplied = true;
    }
    return isApplied;
}