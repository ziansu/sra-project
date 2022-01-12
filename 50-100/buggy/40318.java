public synchronized int getPosition(com.amiyasahu.linkedlists.singly.ListNode node) {
    com.amiyasahu.linkedlists.singly.ListNode temp = head;
    int position = 0;
    if (temp != null) {
        if (temp.equals(node)) {
            return position;
        }
        position++;
        temp = temp.getNext();
    }
    return -1;
}