private static void generateIncludeExclude(java.lang.StringBuilder sb, java.lang.String sp, java.lang.String key, java.util.List<java.lang.String> includes) {
    if ((includes.size()) > 0) {
        sb.append(sp).append("  ").append(key).append("\n");
        for (java.lang.String inc : includes) {
            sb.append(sp).append("    ").append(inc);
        }
    }
}