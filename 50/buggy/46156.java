public java.lang.String[] add(java.lang.String directory, java.lang.String[] filesToAdd) {
    return runProcess(directory, "gitadd.sh", filesToAdd);
}