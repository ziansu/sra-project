public void removeTail() {
    Node position = start;
    if ((size) == 0) {
        return ;
    }else
        if ((size) == 1) {
            start = null;
            end = null;
            (size)--;
            return ;
        }
    
    while (true) {
        if ((position.getNext().getNext()) == null) {
            position.setNext(null);
            (size)--;
            break;
        }else {
            position = position.getNext();
        }
    } 
}