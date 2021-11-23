public boolean removeWithChildren(java.lang.String path) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<java.lang.String> keys = getEHCache().getKeys();
    java.lang.String keyToRemove = makeKeyFromPath(path);
    boolean removed = false;
    for (java.lang.String key : keys) {
        if (key.startsWith(keyToRemove)) {
            removed = (getEHCache().remove(key)) || removed;
        }
    }
    return removed;
}