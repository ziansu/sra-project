public void deleteTemp(java.lang.String uuid) {
    java.io.File index = new java.io.File(((((getAppdata()) + "/installed_maps/") + uuid) + "/temp"));
    java.lang.String[] entries = index.list();
    for (java.lang.String s : entries) {
        java.io.File currentFile = new java.io.File(index.getPath(), s);
        currentFile.delete();
    }
    index.delete();
}