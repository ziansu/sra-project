protected boolean destroyDirs(java.io.File top) {
    boolean canDestroyMe = true;
    if (top.isDirectory())
        for (java.io.File f : top.listFiles())
            canDestroyMe = (destroyDirs(f)) && canDestroyMe;
        
    
    return canDestroyMe && (top.delete());
}