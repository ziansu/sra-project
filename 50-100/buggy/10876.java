public boolean addAtBegining(E data) {
    if (isLinkedListEmpty()) {
        root.setData(data);
        tail = root;
        (size)++;
        return true;
    }else {
        datastructures.linkedlist.Node<E> newNode = new datastructures.linkedlist.Node<E>(data);
        newNode.setNext(root);
        root.setPrev(newNode);
        root = newNode;
        return true;
    }
}