public static <T> java.util.List<T> toList(T... values) {
    java.util.List<T> list = new java.util.ArrayList<T>(values.length);
    for (T val : values)
        list.add(val);
    
    return list;
}