public boolean accept(java.io.File dir, java.lang.String name) {
    java.io.File f = new java.io.File(dir, name);
    if (exclusions.contains(f.toPath())) {
        java.lang.System.err.println(("Excluding " + (f.getAbsolutePath())));
        return false;
    }
    return languageFilter.accept(dir, name);
}