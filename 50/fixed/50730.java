public java.lang.String[] commit(java.lang.String directory, java.lang.String[] args) {
    return runProcess(directory, "gitcommit.sh", args);
}