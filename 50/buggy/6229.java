@java.lang.Override
public boolean hasNext() {
    return ((cursor) + 1) < (batches);
}