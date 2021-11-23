public boolean hasNext() {
    if (((current) != null) && (current.hasNext()))
        return true;
    
    if (rels.hasNext()) {
        current = rels.next().other().iterator();
        return hasNext();
    }
    return false;
}