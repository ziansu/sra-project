private java.lang.Object readFromFile(java.io.File cloneFile) throws java.io.IOException, java.lang.ClassNotFoundException {
    if ((cloneFile.exists()) == false)
        throw new java.io.FileNotFoundException(FILE_NAME.concat(" not found!"));
    
    java.io.FileInputStream fis = new java.io.FileInputStream(cloneFile);
    java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
    java.lang.Object newObject = null;
    try {
        newObject = ois.readObject();
    } finally {
        ois.close();
    }
    return newObject;
}