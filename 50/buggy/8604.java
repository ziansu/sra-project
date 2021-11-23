public static <T> java.util.List<T> toList(T[] o) {
    java.util.List<T> d = new java.util.ArrayList<T>();
    for (T e : o)
        d.add(e);
    
    return d;
}