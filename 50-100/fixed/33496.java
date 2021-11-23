public static void saveMultipartFile(org.springframework.web.multipart.MultipartFile srcFile, java.lang.String desPath) {
    java.lang.String path = com.subang.util.SuUtil.servletContext.getRealPath(desPath);
    java.io.File file = new java.io.File(path);
    try {
        srcFile.transferTo(file);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}