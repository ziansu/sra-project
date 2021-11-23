public void add(java.lang.Object valor) {
    DoubleNode newDoubleNode = new DoubleNode();
    newDoubleNode.setDato(valor);
    if (((start) == null) && ((end) == null)) {
        start = newDoubleNode;
        end = start;
    }else {
        DoubleNode current = end;
        current.setNext(newDoubleNode);
        newDoubleNode.setPrev(current);
        end = newDoubleNode;
    }
    (largo)++;
}