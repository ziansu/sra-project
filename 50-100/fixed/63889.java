private void finalCheck(java.lang.String observed, java.lang.String[] expected) {
    java.lang.String s0 = observed.replaceAll("[()]", "");
    java.lang.String s1 = s0.replaceAll("v[0-9]", "v");
    java.util.SortedSet<java.lang.String> s2 = new java.util.TreeSet<java.lang.String>(java.util.Arrays.asList(s1.split("&&")));
    java.util.SortedSet<java.lang.String> s3 = new java.util.TreeSet<java.lang.String>(java.util.Arrays.asList(expected));
    assertEquals(s3, s2);
}