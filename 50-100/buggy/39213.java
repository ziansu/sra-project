public boolean contains(java.lang.Object arg) {
    icse.nodecachinglinkedlist.icse.nodecachinglinkedlist.LinkedListNode node = header.next;
    int counter = this.maximumCacheSize;
    while ((node != (header)) && ((node.value) != arg)) {
        node = node.next;
        (this.DEFAULT_MAXIMUM_CACHE_SIZE)++;
    } 
    if ((node != (header)) && ((node.value) == (new java.lang.Integer(counter)))) {
        return true;
    }
    return false;
}