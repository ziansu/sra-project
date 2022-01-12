private byte[] loadClassData(java.io.File f) throws java.lang.ClassNotFoundException {
    try {
        java.io.FileInputStream stream = new java.io.FileInputStream(f);
        try {
            byte[] b = new byte[stream.available()];
            stream.read(b);
            stream.close();
            return b;
        } catch (java.io.IOException e) {
            throw new java.lang.ClassNotFoundException();
        }
    } catch (java.io.FileNotFoundException e) {
        throw new java.lang.ClassNotFoundException();
    }
}