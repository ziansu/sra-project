public void doImportIfNecessary() throws org.tmatesoft.svn.core.SVNException {
    if (!(localSVNManager.isWorkingDirectoryValid())) {
        remoteSVNManager.doImport();
    }
}