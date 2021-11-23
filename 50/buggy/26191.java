public boolean get(int index) {
    return ((data[(index >>> (algorithm.datastructure.array.BooleanArray.ADDRESS_BITS))]) & (1L << (index & (algorithm.datastructure.array.BooleanArray.MASK)))) > 0;
}