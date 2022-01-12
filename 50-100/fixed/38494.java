public ByteArrayCharSequence subSequence(int start, int end) {
    if ((start < 0) || (end > ((this.end) - (offset)))) {
        throw new java.lang.IllegalArgumentException(((((("Illegal range " + start) + "-") + end) + " for sequence of length ") + (length())));
    }
    return new ByteArrayCharSequence(data, (start + (offset)), (end + (offset)));
}