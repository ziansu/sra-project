public void addUser(java.lang.String userName, java.lang.String displayName) {
    if ((displayName.length()) > 0) {
        if (!(cache.containsKey(userName))) {
            cache.put(userName, displayName);
        }
    }
}