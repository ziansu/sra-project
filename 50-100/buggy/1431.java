public java.util.HashMap<java.lang.Long, java.lang.Boolean> getUnread_entriesMap() {
    if ((unread_entriesMap) == null) {
        unread_entriesMap = new java.util.HashMap<java.lang.Long, java.lang.Boolean>();
        if ((unread_entries) != null) {
            for (java.lang.Long unreadEntry : unread_entries) {
                unread_entriesMap.put(unreadEntry, true);
            }
        }
    }
    return unread_entriesMap;
}