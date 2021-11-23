public LLNode<E> removeLast() {
    try {
        LLNode<E> oldLast = first;
        last = null;
        return oldLast;
    } catch (java.lang.NullPointerException e) {
        return null;
    }
}