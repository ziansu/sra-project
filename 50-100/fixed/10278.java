public static boolean isUnique(final java.lang.String string) {
    java.util.Set<java.lang.Character> set = new java.util.HashSet<>();
    for (int i = 0; i < (string.length()); i++) {
        set.add(string.charAt(i));
    }
    return (set.size()) == (string.length());
}