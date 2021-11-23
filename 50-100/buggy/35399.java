public static boolean containsRight(java.lang.Iterable<? extends org.threadly.util.Pair<?, ?>> search, java.lang.Object value) {
    for (org.threadly.util.Pair<?, ?> p : search) {
        if ((p.left) == null) {
            if (value == null) {
                return true;
            }
        }else
            if (p.right.equals(value)) {
                return true;
            }
        
    }
    return false;
}