public void deleteAtPos(int position) {
    if (position == 1) {
        head = head.next;
    }else {
        LinkedList.Node temp = head;
        for (int i = 1; (i < position) && ((temp.next.next) != null); i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
}