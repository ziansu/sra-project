public final BinaryNum shiftLeft() {
    final boolean[] newBits = new boolean[bits.length];
    for (int i = 1; i < (bits.length); i++) {
        newBits[(i - 1)] = bits[i];
    }
    newBits[((bits.length) - 1)] = false;
    return new BinaryNum(newBits);
}