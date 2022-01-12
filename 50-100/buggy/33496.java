public static void saveMultipartFile(java.lang.Boolean isReplace, org.springframework.web.multipart.MultipartFile srcFile, java.lang.String desPath) throws com.subang.tool.SuException {
    java.lang.String path = com.subang.util.SuUtil.servletContext.getRealPath(desPath);
    java.io.File file = new java.io.File(path);
    if ((!isReplace) && (file.exists())) {
        throw new com.subang.tool.SuException("文件重名。");
    }
    try {
        srcFile.transferTo(file);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}