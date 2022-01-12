public java.util.List<java.io.File> listFiles() {
    java.util.List<java.io.File> result = new java.util.ArrayList<>();
    for (java.io.File f : dataFolder.listFiles()) {
        if (f.isFile()) {
            result.add(f);
        }
    }
    return result;
}