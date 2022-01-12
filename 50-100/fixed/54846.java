private static <T> java.util.List<T> append(java.util.List<T> xs, T x) {
    java.util.ArrayList<T> rs = new java.util.ArrayList<T>();
    rs.addAll(xs);
    rs.add(x);
    return rs;
}