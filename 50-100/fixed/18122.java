public java.util.Set<Contact> getContacts(int... ids) {
    for (int i = 0; i < (ids.length); i++) {
        if (((ids[i]) <= 0) || ((ids[i]) > (lastContactId))) {
            throw new java.lang.IllegalArgumentException("ID is not valid");
        }
    }
    return new java.util.HashSet<Contact>();
}