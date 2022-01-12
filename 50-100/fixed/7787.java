private data_structures.Node findNode(int index) {
    if (index == ((size) - 1)) {
        return tail;
    }
    data_structures.Node node = head;
    for (int i = 0; i < index; i++) {
        node = node.getNext();
    }
    return node;
}