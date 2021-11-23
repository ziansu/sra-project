public static void moveFile(java.lang.String srcFile, java.lang.String destFile) throws java.lang.IllegalArgumentException {
    if (com.elminster.common.util.FileUtil.isFileExist(srcFile)) {
        throw new java.lang.IllegalArgumentException(com.elminster.common.util.Messages.getString(Message.SOURCE_FILE_ISNT_EXIST, srcFile));
    }
    java.io.File src = new java.io.File(srcFile);
    com.elminster.common.util.FileUtil.createFolder(destFile);
    java.io.File dest = new java.io.File(destFile);
    src.renameTo(dest);
}