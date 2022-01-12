public int indexFromPointer(final long p) {
    return ((int) (p / (_chunkBytes)));
}