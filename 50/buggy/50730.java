public java.lang.String[] commit(java.lang.String directory, java.lang.String message) {
    return runProcess(directory, "gitcommit.sh", new java.lang.String[]{ message });
}