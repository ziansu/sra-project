public java.io.FileInputStream getFile(java.lang.String homePath, java.lang.String fileName) {
    java.io.FileInputStream file;
    try {
        java.lang.System.out.println(("=============== real path = " + homePath));
        file = new java.io.FileInputStream(new java.io.File(((homePath + "/report/") + fileName)));
        return file;
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
    return null;
}