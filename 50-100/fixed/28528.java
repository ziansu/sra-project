@java.lang.Override
public java.util.Set<implementations.Contact> getContacts(java.lang.String name) {
    java.util.Set<implementations.Contact> filteredContacts = new java.util.HashSet<implementations.Contact>();
    filteredContacts.addAll(implementations.ContactManagerImpl.contacts);
    java.util.Iterator<implementations.Contact> iterator = filteredContacts.iterator();
    while (iterator.hasNext()) {
        implementations.Contact thing = iterator.next();
        if (!(thing.getName().contains(name))) {
            iterator.remove();
        }
    } 
    return filteredContacts;
}