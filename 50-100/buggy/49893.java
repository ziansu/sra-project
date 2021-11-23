public int size() {
    queues.RandomizedQueue<Item>.Node pNode = first;
    queues.RandomizedQueue<Item>.Node qNode = last;
    int count = 0;
    while (pNode != qNode) {
        pNode = pNode.next;
        count++;
    } 
    return count;
}