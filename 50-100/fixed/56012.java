public void remove(LinkedList<T>.Node<T> currentNode, int index) {
    if (((currentNode.next) != null) && (index == 1)) {
        currentNode.next = currentNode.next.next;
        (_count)--;
    }else {
        remove(currentNode.next, (index - 1));
    }
}