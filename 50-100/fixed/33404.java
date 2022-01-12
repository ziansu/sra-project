public void deleteAtPos(int position) {
    LinkedList.Node temp = head;
    if (position == 1) {
        head = temp.next;
    }
    for (int i = 1; (i < (position - 1)) && (temp != null); i++) {
        temp = temp.next;
    }
    temp.next = temp.next.next;
    (length)--;
}