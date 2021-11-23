public static void normalize(java.util.Collection<java.lang.String> strings) {
    java.util.HashSet<java.lang.String> normalized = new java.util.HashSet<java.lang.String>(strings.size());
    for (java.lang.String string : strings) {
        normalized.add(string.trim().toLowerCase());
    }
    strings.clear();
    strings.addAll(normalized);
}