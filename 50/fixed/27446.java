java.lang.String indexNameForTimestamp(long timestampMillis) {
    return ((index) + "-") + (dateFormat.get().format(new java.util.Date(timestampMillis)));
}