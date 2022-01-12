boolean actualFilePresent(java.lang.String fileName, long actualTime) {
    java.io.File file = new java.io.File(context.getFilesDir(), fileName);
    if (file.exists()) {
        if (((java.lang.System.currentTimeMillis()) - (file.lastModified())) > actualTime) {
            return false;
        }
    }else {
        return false;
    }
    return true;
}