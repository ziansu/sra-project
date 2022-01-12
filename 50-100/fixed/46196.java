public void fileSaved(snap.project.WebFile aFile) {
    if ((aFile.isDir()) && (aFile == (getClassPath().getFile())))
        readSettings();
    
    if (!(aFile.isDir()))
        addBuildFile(aFile);
    
}