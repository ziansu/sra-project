private RandomizedQueue<Item>.Node nodeAt(int index) {
    RandomizedQueue<Item>.Node node = first;
    for (int i = 1; i < index; i++) {
        node = node.next;
    }
    return node;
}