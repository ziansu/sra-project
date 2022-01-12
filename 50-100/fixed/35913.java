public boolean deleteTask(java.lang.String task) {
    java.io.File fileToDelete = new java.io.File(directory, (task + ".txt"));
    if (fileToDelete.delete()) {
        masterList.remove(task);
        clearMasterFile();
        writeListToMasterFile();
        return true;
    }
    return false;
}