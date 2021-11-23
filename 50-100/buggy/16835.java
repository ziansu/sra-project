void insertValueAtPosition(final T value, final int pos) {
    if ((pos < 0) || (pos >= (getNumSamples()))) {
        throw new com.yahoo.sketches.SketchesArgumentException((((("Insert position must be between 0 and " + (getNumSamples())) + ", ") + "inclusive. Received: ") + pos));
    }
    data_[pos] = value;
}