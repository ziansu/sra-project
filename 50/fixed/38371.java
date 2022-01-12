public java.lang.String[] remove(java.lang.String directory, java.lang.String[] args) {
    return runProcess(directory, "gitRemove.sh", args);
}