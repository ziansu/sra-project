public static boolean areAnagramsUsingSorting(final java.lang.String s1, final java.lang.String s2) {
    if (((s1 == null) || (s1 == null)) || ((s1.length()) != (s2.length())))
        return false;
    
    final char[] a1 = s1.toCharArray();
    final char[] a2 = s2.toCharArray();
    java.util.Arrays.sort(a1);
    java.util.Arrays.sort(a2);
    return java.util.Arrays.equals(a1, a2);
}