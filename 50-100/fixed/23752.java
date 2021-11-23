public static boolean deleteRecursively(java.io.File dir) {
    boolean success = true;
    if (dir.isDirectory()) {
        java.lang.String[] children = dir.list();
        for (int i = 0; i < (children.length); i++) {
            if (!(net.sourceforge.clonekeenplus.Settings.deleteRecursively(new java.io.File(dir, children[i]))))
                success = false;
            
        }
    }
    if (!(dir.delete()))
        success = false;
    
    return success;
}