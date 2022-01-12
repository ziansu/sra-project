@java.lang.Override
public void remove() {
    java.util.ArrayDeque.DescendingIteratorImpl.checkState(((lastIndex) >= 0));
    java.util.ArrayDeque.checkConcurrentModification((((head) <= (lastIndex)) && ((lastIndex) < (tail))));
    if ((removeAtIndex(lastIndex)) > 0) {
        currentIndex = ((currentIndex) + 1) & ((array.length) - 1);
        fence = head;
    }
    lastIndex = -1;
}