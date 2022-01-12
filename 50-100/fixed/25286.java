public static <T> java.util.List<T> filter(java.util.List<? extends T> elems, Predicate<? super T> pred) {
    if (elems == null) {
        return new java.util.ArrayList<T>();
    }
    java.util.List<T> foundItems = new java.util.ArrayList();
    for (T item : elems) {
        if (pred.checkCondition(item)) {
            foundItems.add(item);
        }
    }
    return foundItems;
}