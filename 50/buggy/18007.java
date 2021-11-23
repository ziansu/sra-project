public static boolean exactLongs(java.lang.Long l1, java.lang.Long l2) {
    if (l1 == null) {
        return l1 == l2;
    }
    return l1.equals(l2);
}