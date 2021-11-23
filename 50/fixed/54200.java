private int compare(E v1, E v2) {
    return (comparator) == null ? v1.compareTo(v2) : comparator.compare(v1, v2);
}