public void sortWith(java.util.Comparator<E> comparator) {
    if (comparator != null) {
        java.util.Collections.sort(this, comparator);
    }
}