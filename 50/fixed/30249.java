public boolean hasItem(java.lang.String aName) {
    if (aName == null) {
        return false;
    }
    aName = aName.toLowerCase().trim();
    return (hash.get(aName)) != null;
}