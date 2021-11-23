public double getValue() {
    int numValues = values.count();
    if (numValues == 0) {
        return 0.0;
    }
    return values.valueAt(0);
}