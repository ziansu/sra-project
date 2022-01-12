public boolean isEmpty() {
    lockfree_set.Node<T> helper = head;
    do {
        helper = helper.next.getReference();
        if (helper == (tail)) {
            break;
        }
        if (!(helper.next.isMarked())) {
            return false;
        }
    } while (true );
    return true;
}