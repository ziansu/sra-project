public static java.lang.String debug_output(java.lang.String[] toprint) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.lang.String s : toprint) {
        sb.append((s + "||"));
    }
    if ((sb.length()) > 1) {
        return sb.toString().substring(0, ((sb.length()) - 1));
    }else {
        return "*";
    }
}