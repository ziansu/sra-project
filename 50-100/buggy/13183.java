public static boolean deleteFolder(java.io.File file) {
    if (file.isDirectory())
        for (java.io.File child : file.listFiles())
            if (!(com.lucasasselli.zero.utils.StorageHelper.deleteFolder(child))) {
                return false;
            }
        
    
    return file.delete();
}