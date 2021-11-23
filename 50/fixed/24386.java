public void setCurrentFile(java.io.File currentFile) {
    this.currentFile = currentFile;
    if (currentFile != null)
        setDisplayName(currentFile.getName());
    
}