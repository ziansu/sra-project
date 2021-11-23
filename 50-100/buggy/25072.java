public static java.lang.Object deserialize(java.lang.String fileName) throws java.io.IOException, java.lang.ClassNotFoundException {
    java.io.FileInputStream fis = new java.io.FileInputStream(fileName);
    java.io.BufferedInputStream bis = new java.io.BufferedInputStream(fis);
    java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bis);
    java.lang.Object obj = ois.readObject();
    ois.close();
    return obj;
}