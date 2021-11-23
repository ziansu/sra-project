private java.io.File writeToFile(java.lang.Object sourceObject) throws java.io.IOException {
    java.io.File cloneFile = new java.io.File(FILE_NAME);
    cloneFile.createNewFile();
    java.io.FileOutputStream fos = new java.io.FileOutputStream(cloneFile);
    java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
    try {
        oos.writeObject(sourceObject);
        oos.flush();
    } finally {
        oos.close();
    }
    return cloneFile;
}