public static <T extends java.util.Collection<E>, E extends java.lang.Comparable> java.util.Collection<E> intersection(T first, T second) {
    java.util.List<E> ret = new java.util.ArrayList<>();
    for (E elem : first) {
        if (Utils.Equivocation.contains(second, elem)) {
            ret.add(elem);
        }
    }
    return ret;
}