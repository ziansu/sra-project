public java.util.List<java.lang.String> listFiles() {
    java.util.List<java.lang.String> result = new java.util.ArrayList<java.lang.String>();
    for (java.io.File f : dataFolder.listFiles()) {
        if (f.isFile()) {
            result.add(f.getName());
        }
    }
    return result;
}