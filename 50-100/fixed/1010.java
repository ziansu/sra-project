public static boolean textsEqual(java.lang.String s1, java.lang.String s2) {
    java.lang.String tmp1 = s1.replaceAll("\n", "").replaceAll("\r", "");
    java.lang.String tmp2 = s2.replaceAll("\n", "").replaceAll("\r", "");
    return tmp1.equals(tmp2);
}