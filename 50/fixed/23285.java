public static boolean isNumber(java.lang.String str) {
    java.lang.String reg = "-?[0-9]+.*[0-9]*";
    return str.matches(reg);
}