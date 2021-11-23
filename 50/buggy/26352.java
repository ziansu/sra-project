private java.lang.Integer getFolderOrderNum(java.lang.String folderName) {
    java.lang.String[] nameToken = folderName.split("_");
    return java.lang.Integer.getInteger(nameToken[0]);
}