private boolean add(LNode point) {
    LNode temp = head;
    while ((temp.getNext()) != null) {
        temp = temp.getNext();
    } 
    temp.setNext(point);
    (size)++;
    return true;
}