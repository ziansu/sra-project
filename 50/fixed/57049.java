public void remove() {
    if (!(removeisValid))
        throw new java.lang.IllegalStateException();
    
    lprev.setNext(l.getNext());
    removeisValid = false;
}