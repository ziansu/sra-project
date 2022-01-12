private void destroyNode(linked_yarn.LinkedYarn.Node toDestroy) {
    (this.uniqueSize)--;
    linked_yarn.LinkedYarn.Node previousNode = toDestroy.prev;
    linked_yarn.LinkedYarn.Node nextNode = toDestroy.next;
    if ((uniqueSize) == 0) {
        head = null;
        return ;
    }
    if (toDestroy == (this.head)) {
        head = nextNode;
        nextNode.prev = null;
    }else
        if (nextNode == null) {
            previousNode.next = null;
        }else {
            previousNode.next = nextNode;
            nextNode.prev = previousNode;
        }
    
}