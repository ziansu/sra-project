@java.lang.Override
public java.util.Set<Contact> getContacts(java.lang.String name) {
    if (name == null) {
        throw new java.lang.NullPointerException();
    }
    java.util.Set<Contact> contactSet = new java.util.HashSet<Contact>();
    Iterator<Contact> myIterator = this.myContacts.iterator();
    while (myIterator.hasNext()) {
        Contact tmpContact = myIterator.next();
        if (tmpContact.getName().contains(name)) {
            contactSet.add(tmpContact);
        }
    } 
    return contactSet;
}