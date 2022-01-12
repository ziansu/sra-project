public static boolean deleteRecursively(java.io.File dir) {
    if (dir.isDirectory()) {
        java.lang.String[] children = dir.list();
        for (int i = 0; i < (children.length); i++) {
            boolean success = net.sourceforge.clonekeenplus.Settings.deleteRecursively(new java.io.File(dir, children[i]));
            if (!success)
                return false;
            
        }
    }
    return dir.delete();
}