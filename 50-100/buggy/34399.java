public static void purgeDirectory(java.io.File dir) {
    java.io.File[] files = dir.listFiles();
    if (files != null) {
        for (java.io.File f : files) {
            if (f.isDirectory()) {
                br.com.francispimentel.filerenamer.util.FileUtils.purgeDirectory(f);
            }else {
                f.delete();
            }
        }
    }
    dir.delete();
}