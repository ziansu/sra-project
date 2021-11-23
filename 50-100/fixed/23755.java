private boolean isImage(java.lang.String filename) {
    java.lang.String[] acceptExt = new java.lang.String[]{ ".jpg" , ".jpeg" , ".png" , ".gif" };
    for (java.lang.String ext : acceptExt) {
        if (filename.toLowerCase().endsWith(ext)) {
            return true;
        }
    }
    return false;
}