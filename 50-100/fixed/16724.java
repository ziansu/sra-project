public static java.util.List<java.lang.String> MidpointInsert(int times, java.lang.String payload) {
    java.util.List<java.lang.String> l = new java.util.ArrayList<java.lang.String>();
    for (int i = 0; i < times; i++) {
        l.add(((l.size()) / 2), payload);
    }
    return l;
}