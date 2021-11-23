public boolean asyncDelete(java.io.File[] files, boolean waitCompleted) {
    for (java.io.File file : files) {
        java.io.File renamed = new java.io.File(java.lang.String.format("%s.deleted", file.getAbsolutePath()));
        file.renameTo(renamed);
        if (waitCompleted)
            delete(file);
        else
            toBeDeleted.offer(renamed);
        
    }
    return true;
}