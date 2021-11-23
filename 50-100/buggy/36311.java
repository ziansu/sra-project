public int search(T item) {
    SortedLinkedListMultiset<T>.Node currentNode = mHead;
    while (currentNode != null) {
        if (item.toString().equals(currentNode.getElement())) {
            java.lang.System.out.println((((currentNode.getElement()) + (printDelim)) + (currentNode.getCount())));
            return currentNode.getCount();
        }
        currentNode = currentNode.getNext();
    } 
    return 0;
}