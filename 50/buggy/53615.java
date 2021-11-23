public void doImportIfNecessary() throws org.tmatesoft.svn.core.SVNException {
    if (localSVNManager.isWorkingDirectoryValid())
        return ;
    
    remoteSVNManager.doImport();
}