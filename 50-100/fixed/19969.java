public void copyFile(java.io.File source, java.io.File dist) throws java.io.IOException, java.lang.InterruptedException {
    if (source.isFile()) {
        if (dist.exists()) {
            dist.delete();
        }
        java.nio.file.Files.copy(source.toPath(), dist.toPath());
        java.lang.Thread.currentThread().sleep(100);
    }else {
        copyDirectory(source, dist);
    }
    (progress)++;
}