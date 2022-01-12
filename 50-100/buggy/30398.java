public static <T> void rangeEq(java.lang.String name, T value, java.lang.Comparable<T> min, java.lang.Comparable<T> max) {
    if (((min.compareTo(value)) == 1) || ((max.compareTo(value)) == (-1))) {
        java.lang.String message = java.lang.String.format("Expected %s <= %s <= %s, but %2$s was %s.", min, name, max, value);
        throw new java.lang.IllegalArgumentException(message);
    }
}