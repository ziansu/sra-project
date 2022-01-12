@java.lang.Override
protected void accessApplied(java.lang.String key, int oldAccess, int newAccess) {
    if (oldAccess != newAccess) {
        brokenLines.remove(key.replace(" ", ""));
    }
}