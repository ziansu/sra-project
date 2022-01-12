public void remove() {
    if (isEmpty()) {
    }else {
        current = head;
        if ((size()) > 1) {
            while ((current.getNext().getNext()) != null) {
                current = current.getNext();
            } 
            tail = current;
            tail.setNext(null);
        }else {
            current = null;
            head = null;
            tail = null;
        }
    }
}