@java.lang.Override
public void forEachRemaining(java.util.function.DoubleConsumer action) {
    java.util.Objects.requireNonNull(action);
    int i;
    if (((i = index) >= 0) && (i < (index = fence))) {
        do {
            action.accept(array[arrayIndex]);
            arrayIndex = nextArrayIndex(arrayIndex);
        } while ((++i) < (fence) );
    }
}