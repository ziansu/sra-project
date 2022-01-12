public T next() {
    if (!(hasNext())) {
        throw new java.util.NoSuchElementException();
    }
    utils.FlexRedBlackTree<T>.BinaryNode temp = s.pop();
    if ((temp.next) != null) {
        s.push(temp.next);
    }
    if ((temp.rightChild) != null) {
        putLeftMostNodeOnStack(temp.rightChild);
    }
    lastNode = temp.element;
    return lastNode;
}