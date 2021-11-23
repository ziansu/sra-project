public void removeMiddle() {
    swingGUI.DoubleNode temp = current.getPrev();
    current.getNext().setPrev(current.getPrev());
    current.getPrev().setNext(current.getNext());
    current.setNext(null);
    current.setPrev(null);
    current = temp;
    (count)--;
}