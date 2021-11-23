public org.entrystore.Entry getEntryByName(java.lang.String name) {
    if ((names2EntryURI) == null) {
        loadNameIndex();
    }
    return getByEntryURI(names2EntryURI.get(name));
}