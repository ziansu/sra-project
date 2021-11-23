public static <T extends java.lang.Comparable<T>> T clipInRange(T min, T max, T value) {
    assert (max.compareTo(min)) > 0;
    if ((value.compareTo(min)) < 0) {
        return min;
    }else
        if ((value.compareTo(max)) > 0) {
            return max;
        }
    
    return value;
}