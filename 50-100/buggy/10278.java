public static boolean isUnique(final java.lang.String string) {
    java.util.Set<java.lang.Character> set = new java.util.HashSet<>();
    for (int i = 0; i < (string.length()); i++) {
        int previousSize = set.size();
        set.add(string.charAt(i));
        if ((set.size()) == previousSize) {
            return false;
        }
    }
    return true;
}