public void setImageLocation(java.lang.String file) {
    if ((mimageStore) != null) {
        new java.io.File(mimageStore).delete();
        mimageStore = file;
    }else {
        mimageStore = file;
    }
}