public org.skyscreamer.jsonassert.JSONCompareResult unexpected(java.lang.String field, java.lang.Object actual) {
    _fieldUnexpected.add(new org.skyscreamer.jsonassert.FieldComparisonFailure(field, null, actual));
    fail(formatUnexpected(field, actual));
    return this;
}