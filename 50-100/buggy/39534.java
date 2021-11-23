private boolean add(LNode point) {
    LNode point = head;
    while ((point.getNext()) != null) {
        point = point.getNext();
    } 
    point.setNext(point);
    (size)++;
    return true;
}