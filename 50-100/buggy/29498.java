public boolean isEmpty() {
    lockfree_set.Node<T> helper = head;
    do {
        helper = helper.next.getReference();
        if (!(helper.next.isMarked())) {
            return true;
        }
        if (helper == (tail)) {
            break;
        }
    } while (true );
    return false;
}