public java.lang.String getFileRollContents(java.lang.String type) {
    java.lang.String value = "";
    try {
        if (type.equals("hadoop")) {
            value = hdfsDao.getFileRollFile();
        }else {
            value = frDao.getFileRollFile();
        }
    } catch (java.lang.Exception e) {
    }
    return value;
}