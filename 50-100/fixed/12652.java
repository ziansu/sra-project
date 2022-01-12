public boolean hasNext() {
    while (((current) == null) || (!(current.hasNext()))) {
        if (rels.hasNext()) {
            current = rels.next().other().iterator();
        }else {
            break;
        }
    } 
    return ((current) != null) && (current.hasNext());
}