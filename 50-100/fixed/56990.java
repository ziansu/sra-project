public static synchronized java.util.Date touch(java.io.File file, java.util.Date date) throws java.io.FileNotFoundException, java.io.IOException {
    if (date == null)
        date = java.util.Calendar.getInstance().getTime();
    
    if (!(file.exists())) {
        try (java.io.FileOutputStream fs = new java.io.FileOutputStream(file)) {
        }
    }else
        if (!(file.setLastModified(date.getTime()))) {
            throw new java.io.IOException("Could not update time");
        }
    
    return date;
}