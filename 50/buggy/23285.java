public static boolean isNumber(java.lang.String str) {
    java.lang.String reg = "-?[0-9]+.*[0-9]*";
    return str.matches(reg) ? !(java.lang.Integer.valueOf(str.charAt(0)).equals(java.lang.Integer.valueOf('0'))) : false;
}