static boolean containsWhiteSpace(java.lang.String str) {
    return ((((str.contains(" ")) || (str.contains("\t"))) || (str.contains("\n"))) || (str.contains("\r"))) || (str.contains("\f"));
}