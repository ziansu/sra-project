public int compare(java.lang.Object keyA, java.lang.Object keyB) {
    java.lang.Comparable valueA = ((java.lang.Comparable) (map.get(keyA)));
    java.lang.Comparable valueB = ((java.lang.Comparable) (map.get(keyB)));
    if ((valueA.compareTo(valueB)) == 0)
        return 1;
    
    return valueA.compareTo(valueB);
}