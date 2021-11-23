private boolean includeDocument(int doc) {
    for (int i = 0; i < (fieldVals.length); ++i) {
        final org.elasticsearch.index.fielddata.NumericDoubleValues doubleValues = values[i];
        final double value = doubleValues.get(doc);
        if (value == (java.lang.Double.NEGATIVE_INFINITY)) {
            return false;
        }
        fieldVals[i] = value;
    }
    return true;
}