private void folderClick(java.awt.event.MouseEvent evt) {
    com.pwoodward.projectsearch.frmMain.Directory selectedDir = ((com.pwoodward.projectsearch.frmMain.Directory) (this.lstFolders.getSelectedValue()));
    if ((evt.getClickCount()) == 1) {
        this.currentDirectory.clear();
        DirectoryListing(selectedDir.fullPath(), false, this.currentDirectory);
        return ;
    }
    openDirectory(selectedDir.fullPath());
    addToRecentFolderList(selectedDir);
}