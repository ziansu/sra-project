public void removeProject(java.lang.String project) {
    java.io.File file = new java.io.File(getFileLocation());
    java.io.File filterFile = new java.io.File(getFilterFileLocation());
    filterFile.delete();
    boolean deleted = file.delete();
    if (deleted) {
        allDocs.remove(project);
    }
}