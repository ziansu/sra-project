public void setFileName(java.lang.String value) {
    mFileName = value;
    if (value != null) {
        java.io.File fname = new java.io.File(value);
        this.mVokPath = fname.getParent();
    }else {
        this.mVokPath = null;
    }
}