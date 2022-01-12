public static java.util.Set<java.lang.Object> difference(java.util.Set<java.lang.Object> s1, java.util.Set<java.lang.Object> s2) {
    java.util.Set<java.lang.Object> s3 = new java.util.HashSet<>();
    for (java.lang.Object x : s1) {
        if (!(s2.contains(x))) {
            s3.add(x);
        }
    }
    return s3;
}