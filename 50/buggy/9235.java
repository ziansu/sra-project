@java.lang.Override
protected long decrement(int index) {
    return java.lang.Byte.toUnsignedLong((--(counters[index])));
}