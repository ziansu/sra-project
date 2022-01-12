public static <T> java.util.ArrayList<T> filter(java.util.List<? extends T> elems, Predicate<? super T> pred) {
    if (elems == null) {
        return null;
    }
    java.util.ArrayList<T> foundItems = new java.util.ArrayList();
    for (T item : elems) {
        if (pred.checkCondition(item)) {
            foundItems.add(item);
        }
    }
    return ((java.util.ArrayList) (foundItems.clone()));
}