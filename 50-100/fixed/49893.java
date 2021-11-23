public int size() {
    queues.RandomizedQueue<Item>.Node pNode = first;
    queues.RandomizedQueue<Item>.Node qNode = last;
    if ((first) == null)
        return 0;
    
    int count = 1;
    while (pNode != qNode) {
        pNode = pNode.next;
        count++;
    } 
    return count;
}