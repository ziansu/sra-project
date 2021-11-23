public java.lang.String getSimPath() {
    java.lang.String root = properties.getRoot();
    java.lang.String simName = properties.getSim();
    if (!(fileStem.getText().trim().equals(""))) {
        return (((root + (java.io.File.separator)) + simName) + (java.io.File.separator)) + (fileStem.getText().trim());
    }
    return (root + (java.io.File.separator)) + simName;
}