public boolean accept(java.io.File dir, java.lang.String name) {
    if ((name.lastIndexOf('.')) > 0) {
        int lastIndex = name.lastIndexOf('.');
        java.lang.String str = name.substring(lastIndex);
        if (str.equals(".jpg")) {
            return true;
        }
    }
    return false;
}