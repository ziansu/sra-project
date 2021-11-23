protected static final long computeLastModificationDateRecursive(java.io.File file) {
    if (file.isDirectory()) {
        long lastModificationDate = file.lastModified();
        for (java.io.File f : file.listFiles()) {
            long lastChange = step.commons.helpers.FileHelper.computeLastModificationDateRecursive(f);
            if (lastChange > lastModificationDate) {
                lastModificationDate = lastChange;
            }
        }
        return lastModificationDate;
    }else {
        return file.lastModified();
    }
}