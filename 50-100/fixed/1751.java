public static void normalize(java.util.Collection<java.lang.String> strings) {
    java.util.HashSet<java.lang.String> normalized = new java.util.HashSet<java.lang.String>(strings.size());
    for (java.lang.String string : strings) {
        if (string == null) {
            normalized.add(null);
        }else {
            normalized.add(string.trim().toLowerCase());
        }
    }
    strings.clear();
    strings.addAll(normalized);
}