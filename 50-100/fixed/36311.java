public int search(T item) {
    SortedLinkedListMultiset<T>.Node currentNode = mHead;
    while (currentNode != null) {
        if (item.toString().equals(currentNode.getElement())) {
            return currentNode.getCount();
        }
        currentNode = currentNode.getNext();
    } 
    return 0;
}