protected void prepareForAdd(long index, int currentArraySize) {
    int intIndex = ((int) (index));
    rangeCheck(index, size);
    ensureCapacity(intIndex, currentArraySize);
    resetSize(intIndex);
}