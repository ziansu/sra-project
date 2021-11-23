private void delete(Neighborhood neighborhood) {
    if ((neighborhood.getNode()) == null) {
        return ;
    }
    Node prev = neighborhood.getPrevNode();
    Node next = neighborhood.getNode().getNext();
    if (prev == null) {
        first = first.getNext();
    }else {
        prev.setNext(next);
    }
    (length)--;
}