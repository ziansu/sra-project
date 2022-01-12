public static java.util.Set<java.lang.Object> difference(java.util.Set<java.lang.Object> s1, java.util.Set<java.lang.Object> s2) {
    java.util.Set<java.lang.Object> s3 = new java.util.HashSet<>();
    for (java.lang.Object m : s1) {
        if (!(s2.contains(m))) {
            s3.add(m);
        }
    }
    return s3;
}