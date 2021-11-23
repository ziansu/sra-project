@java.lang.Override
public void onClick(java.io.File file) {
    setCurrentDirectory(file);
    openFile(currentDirectory.getAbsolutePath(), true);
}