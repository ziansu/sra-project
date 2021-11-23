java.lang.String indexNameForTimestamp(long timestampMillis) {
    return ((index) + "-") + (dateFormat.format(new java.util.Date(timestampMillis)));
}