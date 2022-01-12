@java.lang.Override
public int get(int idx) throws java.util.NoSuchElementException {
    if ((idx >= (lastIndex)) || (idx < 0)) {
        throw new java.util.NoSuchElementException();
    }else {
        track.lessons.lesson3.MyLinkedList.Node current = first;
        for (int i = 0; i < idx; i++) {
            current = current.next;
        }
        return current.val;
    }
}