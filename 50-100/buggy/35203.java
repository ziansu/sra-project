public void add(int valor) {
    Node newNode = new Node();
    newNode.setDato(valor);
    if ((root) == null) {
        root = newNode;
    }else {
        Node current = root;
        while ((current.getNext()) != null) {
            current = current.getNext();
        } 
        current.setNext(newNode);
    }
    (largo)++;
}