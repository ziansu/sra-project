static long nextInSequence(long number) {
    return (number & 1) == 0 ? number >> 1 : (number * 3) + 1;
}