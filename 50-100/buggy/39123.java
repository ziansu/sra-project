public com.itechart.data.entity.File buildFile(java.util.Map<java.lang.String, java.lang.String> parameters) {
    java.lang.String realName = parameters.get("photoFile_real");
    java.lang.String storedName = parameters.get("photoFile_stored");
    if (com.mysql.jdbc.StringUtils.isNullOrEmpty(storedName)) {
        return null;
    }
    if (com.mysql.jdbc.StringUtils.isNullOrEmpty(realName))
        realName = storedName;
    
    com.itechart.data.entity.File file = new com.itechart.data.entity.File();
    file.setName(realName);
    file.setStoredName(storedName);
    return file;
}