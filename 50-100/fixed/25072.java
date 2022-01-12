public static java.lang.Object deserialize(java.io.InputStream fis) throws java.io.IOException, java.lang.ClassNotFoundException {
    java.io.BufferedInputStream bis = new java.io.BufferedInputStream(fis);
    java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bis);
    java.lang.Object obj = ois.readObject();
    ois.close();
    return obj;
}