@java.lang.Override
public T get(final int index) {
    if ((index < 0) || (index >= (this.size()))) {
        throw new java.lang.IndexOutOfBoundsException(new org.cactoos.text.Sprintf("index=%d, bounds=[%d; %d]", index, 0, this.size()).asString());
    }
    return this.cachedItem(index);
}