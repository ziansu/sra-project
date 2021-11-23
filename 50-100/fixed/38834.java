@java.lang.Override
public T get(final int index) {
    if ((index < 0) || (index >= (this.size()))) {
        throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("index=%d, bounds=[%d; %d]", index, 0, this.size()));
    }
    return this.cachedItem(index);
}