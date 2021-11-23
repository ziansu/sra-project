public static cc.mallet.fst.CRF loadCrf(java.io.InputStream fis) throws java.io.IOException, java.lang.ClassNotFoundException {
    java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
    return ((cc.mallet.fst.CRF) (ois.readObject()));
}