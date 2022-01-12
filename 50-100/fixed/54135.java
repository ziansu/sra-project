public static void deleteFolderRecursively(java.io.File file) {
    try {
        java.io.File[] allFiles = file.listFiles();
        if (allFiles == null) {
            file.delete();
            return ;
        }
        for (java.io.File f : allFiles) {
            if (f.isDirectory())
                com.MadokaMagica.mod_madokaMagica.util.Helper.deleteFolderRecursively(f);
            else
                f.delete();
            
        }
        file.delete();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}