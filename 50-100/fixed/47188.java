public static boolean uploadFile(java.util.List<java.io.File> fileList) throws java.io.IOException {
    com.mmall.util.FTPutil ftputil = new com.mmall.util.FTPutil(com.mmall.util.FTPutil.ftpIp, 21, com.mmall.util.FTPutil.ftpUser, com.mmall.util.FTPutil.ftpPass);
    com.mmall.util.FTPutil.logger.info("开始连接FTP服务器");
    boolean result = ftputil.uploadFile("img", fileList);
    com.mmall.util.FTPutil.logger.info("结束上传，上传结果为{}", result);
    return result;
}