public void addAll(T[] array, int offset, int length) {
    T[] items = this.items;
    int sizeNeeded = ((size) + length) - offset;
    if (sizeNeeded >= (items.length))
        items = resize(java.lang.Math.max(8, ((int) (sizeNeeded * 1.75F))));
    
    java.lang.System.arraycopy(array, offset, items, size, length);
    size += length;
}