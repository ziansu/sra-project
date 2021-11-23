private java.lang.String getFullFilePath(java.lang.String fileSaveDir, java.lang.String fileName) {
    java.lang.String fileString = "";
    if (fileSaveDir.equals(org.jimple.planner.Storage.EMPTY_STRING)) {
        fileString = fileSaveDir + fileName;
    }else {
        fileString = (fileSaveDir + (java.io.File.separator)) + fileName;
    }
    return fileString;
}