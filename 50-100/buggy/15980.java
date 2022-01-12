public void remove() throws list.InvalidNodeException {
    if (!(isValidNode())) {
        throw new list.InvalidNodeException("remove() called on invalid node");
    }else {
        list.DListNode before = this.prev;
        list.DListNode after = this.next;
        before.next = after;
        after.prev = before;
        myList = null;
        next = null;
        prev = null;
    }
}