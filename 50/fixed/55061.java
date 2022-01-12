@java.lang.Override
public E poll() {
    if ((currentSize) == 0) {
        return null;
    }
    E x = items[takeIndex];
    items[takeIndex] = null;
    takeIndex = getRealIndex(takeIndex);
    --(currentSize);
    return x;
}