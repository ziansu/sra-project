public java.lang.String getPath() {
    if ((path) == null) {
        path = java.lang.System.getProperty("temp.directory");
        java.lang.System.out.println(("path = " + (path)));
    }
    return path;
}