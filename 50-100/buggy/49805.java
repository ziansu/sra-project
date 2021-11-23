private <T> java.util.List<T> filter(java.util.List<T> list, java.util.Set<java.lang.Integer> selectedColumns) {
    java.util.List<T> filtered = com.google.common.collect.Lists.newArrayList();
    for (int i : selectedColumns) {
        filtered.add(list.get(i));
    }
    return filtered;
}