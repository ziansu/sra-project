protected boolean acceptPath(java.nio.file.Path path, java.nio.file.attribute.BasicFileAttributes attrs) {
    logger.info(("acceptPath: " + (path.toFile().getAbsolutePath())));
    if ((fileFilters) != null) {
        java.io.File file = path.toFile();
        for (java.io.FileFilter filter : fileFilters) {
            if (!(filter.accept(file))) {
                return false;
            }
        }
    }
    return true;
}