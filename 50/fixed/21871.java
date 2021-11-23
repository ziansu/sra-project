public void shift(double value) {
    string = null;
    for (org.sd.util.range.AbstractNumericRange.SimpleRange range : ranges) {
        range.shift(value);
    }
}