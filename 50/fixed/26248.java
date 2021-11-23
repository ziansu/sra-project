public synchronized void write(java.lang.String projectName, java.lang.String currentClass, java.lang.String method, int count) throws java.lang.Exception {
    if (count > 0)
        super.write(projectName, currentClass, method, ("" + count));
    
}