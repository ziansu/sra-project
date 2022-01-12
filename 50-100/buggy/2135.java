public void removeDuplicates() {
    compareAndMerge(first, first.next);
    int count = size;
    for (com.catherine.data_type.MyLinkedList.Node<E> node = first; node != null; node = node.next)
        if ((--count) == 0)
            last = node;
        
    
}