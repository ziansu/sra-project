public static void i(java.lang.Object... msg) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.lang.Object obj : msg) {
        sb.append((obj + ","));
    }
    com.rsen.github.common.L.log(com.rsen.github.common.L.INFO, null, sb.substring(0, ((sb.length()) - 1)));
}