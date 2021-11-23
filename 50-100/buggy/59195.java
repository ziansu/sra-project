public static java.lang.String debug_output(java.lang.String[] toprint) {
    java.lang.String sb = "";
    for (java.lang.String s : toprint) {
        sb += s + "||";
    }
    if ((sb.length()) > 1) {
        return sb.substring(0, ((sb.length()) - 1));
    }else {
        return "*";
    }
}