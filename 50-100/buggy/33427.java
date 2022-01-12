@java.lang.SuppressWarnings(value = "unchecked")
T getValueAtPosition(final int pos) {
    if ((itemsSeen_) == 0) {
        throw new com.yahoo.sketches.SketchesArgumentException("Requested element from empty reservoir.");
    }else
        if ((pos < 0) || (pos >= (getNumSamples()))) {
            throw new com.yahoo.sketches.SketchesArgumentException((((("Requested position must be between 0 and " + (getNumSamples())) + ", ") + "inclusive. Received: ") + pos));
        }
    
    return ((T) (data_[pos]));
}