public g8.bookshop.business.core.UserLocal getUser(java.lang.String id) {
    g8.bookshop.business.core.UserLocal u = userMap.get(id);
    if (u == null) {
        u = new g8.bookshop.business.core.Guest(id);
        userMap.put(id, u);
    }
    return u;
}