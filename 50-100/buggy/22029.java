public int indexOf(T element) {
    java.util.Objects.requireNonNull(element, "element");
    int index = 0;
    for (T t : this) {
        ++index;
        if (t.equals(element)) {
            return index;
        }
    }
    throw new java.util.NoSuchElementException(element.toString());
}