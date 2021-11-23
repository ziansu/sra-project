@java.lang.Override
public E poll() {
    E x = items[takeIndex];
    items[takeIndex] = null;
    takeIndex = getRealIndex(takeIndex);
    --(currentSize);
    return x;
}