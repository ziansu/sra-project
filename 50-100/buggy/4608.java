private static long setBits(long word, int offset, int length, long value) {
    long mask = (co.paralleluniverse.fibers.Stack.MASK_FULL) >>> (64 - length);
    word = word & (~(mask << ((64 - offset) - length)));
    value = value & mask;
    word = word | (value << ((64 - offset) - length));
    return word;
}