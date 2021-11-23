private java.util.List<java.io.File> findProject(java.io.File dir, java.util.ArrayList<java.io.File> found) {
    if (dir.isDirectory()) {
        java.io.File descriptor = new java.io.File(dir, ".project");
        if (descriptor.exists()) {
            found.add(dir);
            for (java.io.File file : dir.listFiles()) {
                findProject(file, found);
            }
        }
    }
    return found;
}