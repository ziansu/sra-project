public java.io.File getFileSource() {
    if ((mTCFile) != null) {
        java.io.File f = new java.io.File(mTCFile);
        if (f.canRead()) {
            return f;
        }
    }
    return null;
}