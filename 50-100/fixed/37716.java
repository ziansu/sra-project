public static boolean createFileWithDirs(java.io.File file) {
    if (FileUtil.canReadWrite(file))
        return true;
    else {
        file.getParentFile().mkdirs();
        if (!(FileUtil.createNewFile(file)))
            return false;
        
    }
    return true;
}