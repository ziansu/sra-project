public boolean addTail(objects.SnakePart tail) {
    if ((nextPart) != null)
        return false;
    
    nextPart = tail;
    return true;
}