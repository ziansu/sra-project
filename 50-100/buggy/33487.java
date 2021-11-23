@java.lang.Override
public void remove() {
    java.util.ArrayDeque.IteratorImpl.checkState(((lastIndex) >= 0));
    java.util.ArrayDeque.checkConcurrentModification((((head) <= (lastIndex)) && ((lastIndex) < (tail))));
    if ((removeAtIndex(lastIndex)) < 0) {
        currentIndex = ((currentIndex) - 1) & ((array.length) - 1);
        fence = tail;
    }
    lastIndex = -1;
}