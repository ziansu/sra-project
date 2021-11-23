public static java.lang.String hashSetToString(java.util.HashSet<java.lang.String> hs) {
    java.lang.StringBuffer rv = new java.lang.StringBuffer("");
    for (java.lang.String s : hs) {
        rv.append((s + ","));
    }
    rv.deleteCharAt(((rv.length()) - 1));
    return rv.toString();
}