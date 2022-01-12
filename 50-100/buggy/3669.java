@java.lang.SuppressWarnings(value = "unchecked")
private TKey readObj(long pos) throws java.io.EOFException, java.io.IOException, java.lang.ClassNotFoundException {
    TKey readObject;
    try {
        byte[] buf = new byte[keySize];
        raFile.seek(pos);
        raFile.readFully(buf, 0, keySize);
        java.io.ObjectInputStream is = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(buf));
        readObject = ((TKey) (is.readObject()));
    } catch (java.io.EOFException e) {
        readObject = null;
    }
    return readObject;
}