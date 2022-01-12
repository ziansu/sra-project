public java.lang.Object readObjectToFile(java.lang.String fileName, java.lang.String filePath) throws java.io.IOException, java.lang.ClassNotFoundException {
    java.io.FileInputStream fis = null;
    java.io.ObjectInputStream ois = null;
    try {
        fis = new java.io.FileInputStream(new java.io.File(filePath, fileName));
        ois = new java.io.ObjectInputStream(fis);
        return ois.readObject();
    } finally {
        if (ois != null)
            ois.close();
        
        if (fis != null)
            fis.close();
        
    }
}