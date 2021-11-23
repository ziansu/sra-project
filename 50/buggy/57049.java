public void remove() {
    if (!(removeisValid))
        throw new java.lang.IllegalStateException();
    
    lprev.setNext(l.getNext());
    l = l.getNext();
    removeisValid = false;
}