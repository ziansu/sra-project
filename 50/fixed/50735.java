public static boolean isMathML(java.lang.String string) {
    return (((string.length()) >= 2) && (string.endsWith(">"))) && (string.startsWith("<"));
}