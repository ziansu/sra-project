private java.lang.String formatRecords(com.google.common.collect.Multiset<T> records) {
    return records.stream().map(( r) -> r.toString()).collect(java.util.stream.Collectors.joining(", "));
}