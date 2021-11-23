private static long setBits(long word, int offset, int length, long value) {
    int a = 64 - length;
    int b = a - offset;
    word = word & (~(((co.paralleluniverse.fibers.Stack.MASK_FULL) >>> a) << b));
    word = word | (value << b);
    return word;
}