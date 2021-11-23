public boolean remove(int index) {
    if ((index < 1) || (index > (size())))
        return false;
    
    com.seb.research.algorithms.LinkedList.Node current = head;
    for (int i = 1; i < index; i++) {
        if ((current.getNext()) == null) {
            return false;
        }
    }
    current.setNext(current.getNext().getNext());
    (count)--;
    return true;
}