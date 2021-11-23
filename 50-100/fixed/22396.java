public java.util.Set<Contact> getContacts(java.lang.String name) {
    if (name == null) {
        throw new java.lang.NullPointerException("'null' is invalid as parameter!");
    }
    java.util.Set<Contact> searched = new java.util.HashSet<Contact>();
    if ((name.length()) > 0) {
        for (Contact member : contacts) {
            if (member.getName().contains(name)) {
                searched.add(member);
            }
        }
    }
    return searched;
}