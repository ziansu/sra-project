public static void printMap(java.lang.String javaProject, java.util.Map<java.lang.String, java.util.List<java.lang.String>> imports) {
    for (java.lang.String key : imports.keySet()) {
        if ((imports.get(key)) != null) {
            for (java.lang.String imp : imports.get(key)) {
                java.lang.System.out.println(((((javaProject + ",") + key) + ",") + imp));
            }
        }
    }
}