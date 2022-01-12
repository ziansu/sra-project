public void remove(LinkedList<T>.Node<T> currentNode, int index) {
    if ((currentNode != null) && (index == 1)) {
        currentNode.next = currentNode.next.next;
        (_count)--;
    }else
        if (currentNode != null) {
            remove(currentNode.next, (index - 1));
        }
    
}