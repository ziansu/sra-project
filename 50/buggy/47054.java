public static cc.mallet.fst.CRF loadCrf(java.io.File file) throws java.io.IOException, java.lang.ClassNotFoundException {
    java.io.FileInputStream fis = new java.io.FileInputStream(file);
    java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
    return ((cc.mallet.fst.CRF) (ois.readObject()));
}