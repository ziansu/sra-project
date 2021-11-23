private static boolean skipCTX(java.lang.Class c) {
    return (c.getName().startsWith("java.lang.invoke.")) || (c.getName().contains("$$Lambda$"));
}