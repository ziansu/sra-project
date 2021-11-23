public boolean needToSync(@android.support.annotation.Nullable
java.lang.String candidate) {
    boolean needToSync = false;
    if (candidate == null)
        return needToSync;
    
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