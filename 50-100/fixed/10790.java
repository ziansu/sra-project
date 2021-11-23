public static java.lang.Iterable<java.lang.Object> asList(java.lang.Object x) {
    if (x instanceof java.lang.Iterable) {
        return ((java.lang.Iterable<java.lang.Object>) (x));
    }else {
        java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>(1);
        list.add(x);
        return list;
    }
}