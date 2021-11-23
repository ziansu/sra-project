public java.util.HashMap<java.lang.Long, java.lang.Boolean> getUnread_entriesMap() {
    if ((unread_entries.size()) != (unread_entriesMap.size())) {
        for (java.lang.Long unreadEntry : unread_entries) {
            unread_entriesMap.put(unreadEntry, true);
        }
    }
    return unread_entriesMap;
}