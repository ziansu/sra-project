public static java.lang.String eliminate(java.lang.String string, int start, int end) {
    if (string == null) {
        return null;
    }
    java.lang.String head = "";
    java.lang.String foot = "";
    if (start < (string.length())) {
        head = string.substring(0, start);
    }
    if (end < (string.length())) {
        foot = string.substring((end + 1));
    }
    return head + foot;
}