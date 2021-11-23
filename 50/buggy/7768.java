public java.lang.String getName() {
    java.lang.String p = getPath();
    return new java.io.File(p).getName();
}