public E pop() {
    if ((top.getNext()) == null)
        return null;
    
    E dataToRemove = top.getNext().getData();
    top.setNext(top.getNext().getNext());
    (size)--;
    return dataToRemove;
}