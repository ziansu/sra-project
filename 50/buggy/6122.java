public void unwatchDirectory(java.lang.String directory) {
    java.lang.System.out.println(("Unwatch: " + directory));
    watchedInternalDirectories.remove(directory);
}