@java.lang.Override
public void insert(@com.sun.istack.internal.NotNull
T toInsert) {
    if (isEmpty()) {
        firstNode = new lists.linkedlist.ListNode<T>(toInsert);
    }else {
        lists.linkedlist.ListNode<T> current = firstNode;
        while ((current.getNext()) != null)
            current = current.getNext();
        
        current.setNext(new lists.linkedlist.ListNode<T>(toInsert));
    }
    (_size)++;
}