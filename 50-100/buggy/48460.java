public java.util.List<java.lang.String> getRecentCopy() {
    if (((recentCopy) != null) && (!(copyRecent))) {
        return recentCopy;
    }
    recentCopy = new java.util.ArrayList<java.lang.String>();
    waitOnRecent();
    locked = true;
    for (java.lang.String str : recent) {
        if (str != null)
            continue;
        
        recentCopy.add(str);
    }
    locked = false;
    copyRecent = false;
    return recentCopy;
}