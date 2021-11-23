public java.util.Date getCreationDate(java.io.File file) {
    if (file == null) {
        return new java.util.Date(0L);
    }
    if (file.isDirectory()) {
        return getCreationDateFromFile(file);
    }
    java.util.Date date = getCreationDateFromMetadata(file);
    if (date == null) {
        date = getCreationDateFromFile(file);
    }
    return date;
}