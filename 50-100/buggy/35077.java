public boolean needToSync(java.lang.String candidate) {
    boolean needToSync = false;
    int index = 0;
    for (java.lang.String screen : pendingScreens) {
        if (candidate.equals(screen)) {
            needToSync = true;
            break;
        }
        index++;
    }
    if (needToSync)
        pendingScreens.remove(index);
    
    return needToSync;
}