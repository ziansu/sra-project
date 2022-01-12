public void remove() {
    if (isEmpty()) {
    }else {
        current = head;
        while ((current.getNext().getNext()) != null) {
            current = current.getNext();
        } 
        tail = current;
        tail.setNext(null);
    }
}