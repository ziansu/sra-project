private static <T> java.util.List<T> prepend(T x, java.util.List<T> xs) {
    java.util.ArrayList<T> rs = new java.util.ArrayList<T>();
    rs.add(x);
    rs.addAll(xs);
    return rs;
}