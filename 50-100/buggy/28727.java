public int compare(java.lang.Object keyA, java.lang.Object keyB) {
    java.lang.Comparable valueA = ((java.lang.Comparable) (map.get(keyA)));
    java.lang.Comparable valueB = ((java.lang.Comparable) (map.get(keyB)));
    return valueA.compareTo(valueB);
}