private void addWatchCallbacks(java.lang.String path, java.lang.String sessionId) {
    if (backtype.storm.sharedcontext.ShareContext.watchedPaths.containsKey(path)) {
        backtype.storm.sharedcontext.ShareContext.watchedPaths.get(path).add(sessionId);
    }else {
        java.util.HashSet<java.lang.String> tmp = new java.util.HashSet<java.lang.String>();
        tmp.add(sessionId);
        backtype.storm.sharedcontext.ShareContext.watchedPaths.put(path, tmp);
    }
}