@java.lang.Override
public void run(org.eclipse.core.runtime.IProgressMonitor monitor) throws org.eclipse.core.runtime.CoreException {
    connectionItem.setConnection(temConnection);
    saveMetaData();
    org.talend.core.model.update.RepositoryUpdateManager.updateMultiSchema(connectionItem, oldMetadataTable, oldTableMap);
    closeLockStrategy();
    temConnection = null;
}