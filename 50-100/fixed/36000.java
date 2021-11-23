private void deleteDir(java.io.File dir) {
    java.lang.String[] entries = dir.list();
    if ((entries != null) && ((entries.length) != 0)) {
        for (java.lang.String s : entries) {
            java.io.File currentFile = new java.io.File(dir.getPath(), s);
            if (currentFile.isDirectory()) {
                deleteDir(currentFile);
            }
            currentFile.delete();
        }
    }
    dir.delete();
}