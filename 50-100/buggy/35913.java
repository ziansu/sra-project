public boolean deleteTask(java.lang.String task) {
    java.io.File fileToDelete = new java.io.File(directory, (task + ".txt"));
    if (fileToDelete.delete()) {
        java.lang.System.err.println("delete");
        masterList.remove(task);
        clearMasterFile();
        writeListToMasterFile();
        return true;
    }
    return false;
}