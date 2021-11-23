protected void closeConnection() throws org.apache.maven.wagon.ConnectionException {
    try {
        if ((editor) != null) {
            editor.closeDir();
            editor.closeEdit();
            editor = null;
        }
        if ((queryRepo) != null)
            queryRepo.closeSession();
        
        queryRepo = null;
        if ((commitRepo) != null)
            commitRepo.closeSession();
        
        commitRepo = null;
    } catch (org.tmatesoft.svn.core.SVNException e) {
        throw new org.apache.maven.wagon.ConnectionException("Failed to close svn connection", e);
    }
}