public boolean localFilesMissing() {
    java.util.List<com.threerings.getdown.data.Resource> rsrcs = getAllActiveResources();
    for (com.threerings.getdown.data.Resource r : rsrcs) {
        if ((r._local) == null) {
            return true;
        }
    }
    return false;
}