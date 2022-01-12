public static java.util.List<java.lang.String> MidpointInsert(int times, java.lang.String payload) {
    java.util.List<T> l = new java.util.ArrayList<T>();
    for (int i = 0; i < times; i++) {
        l.add(((l.size()) / 2), payload);
    }
    return l;
}