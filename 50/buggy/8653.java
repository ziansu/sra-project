@java.lang.SuppressWarnings(value = { "NumberEquality" })
private static boolean wasModified(final java.lang.Long l1, final java.lang.Long l2) {
    return (l1 != l2) && (l1 != null ? !(l1.equals(l2)) : !(l2.equals(l1)));
}