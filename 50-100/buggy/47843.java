public Item getItem(int index) {
    int count = 1;
    LinkedList<Item>.Node indexNode = new Node();
    indexNode = first;
    while (count < index) {
        indexNode = indexNode.next;
        count++;
    } 
    return indexNode.item;
}