private int getMinIndex(final java.util.List<java.lang.Class<?>> from, final java.util.List<java.lang.Class<?>> order) {
    int index = from.size();
    for (java.lang.Class<?> type : order) {
        final int i = from.indexOf(type);
        if (index > i) {
            index = i;
        }
    }
    return index;
}