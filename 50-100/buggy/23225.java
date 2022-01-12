public void add(T info) {
    if ((root) == null) {
        root = new collections.Node<T>(info);
    }
    collections.Node<T> temp = new collections.Node<T>(info);
    collections.Node<T> current = root;
    if (current != null) {
        while ((current.getNext()) != null) {
            current = current.getNext();
        } 
        current.setNext(temp);
    }
    collections.LinkedList.incrementCounter();
}