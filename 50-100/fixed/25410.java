public void removeProject(java.lang.String project) {
    java.io.File file = new java.io.File(getFileLocation());
    java.io.File filterFile = new java.io.File(getFilterFileLocation());
    boolean deleted = file.delete();
    deleted = filterFile.delete();
    if (deleted) {
        allDocs.remove(project);
    }
}