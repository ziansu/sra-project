public ds.doublylinkedlist.Node deleteFirst() throws ds.doublylinkedlist.EmptyStructureException {
    if (isEmpty()) {
        throw new ds.doublylinkedlist.EmptyStructureException("Cannot delete from the list because it is empty.");
    }else {
        ds.doublylinkedlist.Node current = new ds.doublylinkedlist.Node();
        current = first;
        if ((first.next) == null) {
            last = null;
        }else {
            first.next.previous = null;
        }
        first = first.next;
        return current;
    }
}