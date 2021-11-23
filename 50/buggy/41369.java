public void addUser(java.lang.String userName, java.lang.String displayName) {
    if (!(cache.containsKey(userName))) {
        cache.put(userName, displayName);
    }
}