public java.lang.String[] status(java.lang.String directory, java.lang.String[] args) {
    return runProcess(directory, "gitStatus.sh", args);
}