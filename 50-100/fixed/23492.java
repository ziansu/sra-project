public ds.doublylinkedlist.Node deleteLast() throws ds.doublylinkedlist.EmptyStructureException {
    if (isEmpty()) {
        throw new ds.doublylinkedlist.EmptyStructureException("Cannot delete the last node because the linked list is empty.");
    }else {
        ds.doublylinkedlist.Node current = new ds.doublylinkedlist.Node();
        current = last;
        if ((last.previous) == null) {
            first = null;
        }else {
            last.previous.next = null;
        }
        last = last.previous;
        (size)--;
        return current;
    }
}