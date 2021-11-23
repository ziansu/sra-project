public static boolean isAnyNotNull(java.lang.Object... items) {
    for (java.lang.Object item : items) {
        if (item != null) {
            return true;
        }
    }
    return true;
}