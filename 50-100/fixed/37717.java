public static void deleteDir(java.lang.String path, org.apache.commons.logging.Log log) {
    if (path == null)
        return ;
    
    java.io.File f = new java.io.File(path);
    if (f.exists()) {
        boolean success = edu.stanford.muse.util.Util.deleteDir(f, log);
        edu.stanford.muse.util.Util.warnIf((!success), ("Unable to delete file: " + (f.getPath())), log);
    }else
        edu.stanford.muse.util.Util.warnIf(true, ("Sorry, can't delete path because it doesn't even exist: " + path), log);
    
}