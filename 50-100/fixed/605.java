private boolean includeDocument(final int doc) {
    for (int i = 0; i < (this.fieldVals.length); ++i) {
        final org.elasticsearch.index.fielddata.NumericDoubleValues doubleValues = values[i];
        final double value = doubleValues.get(doc);
        if (value == (java.lang.Double.NEGATIVE_INFINITY)) {
            return false;
        }
        this.fieldVals[i] = value;
    }
    return true;
}