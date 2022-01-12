public static boolean delete(java.io.File targetFile) {
    if (targetFile.isDirectory()) {
        java.io.File[] fileList = targetFile.listFiles();
        if (fileList != null) {
            for (java.io.File file : fileList) {
                if (!(com.icbc.wfs.WfsUtil.delete(file))) {
                    return false;
                }
            }
        }
    }else
        if (targetFile.exists()) {
            return targetFile.delete();
        }
    
    return true;
}