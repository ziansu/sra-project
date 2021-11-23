public org.teavm.classlib.java.lang.TAbstractStringBuilder delete(int start, int end) {
    if ((start > end) || (start > (length))) {
        throw new org.teavm.classlib.java.lang.TStringIndexOutOfBoundsException();
    }
    if (start == end) {
        return this;
    }
    int sz = (length) - end;
    length -= end - start;
    for (int i = 0; i < sz; ++i) {
        buffer[(start++)] = buffer[(end++)];
    }
    return this;
}