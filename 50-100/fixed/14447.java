public void saveToFile(java.lang.String fileName, java.math.BigInteger mod, java.math.BigInteger exp) throws java.lang.Exception {
    java.io.ObjectOutputStream oout = new java.io.ObjectOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(fileName)));
    try {
        oout.writeObject(mod);
        oout.writeObject(exp);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        oout.close();
    }
}