public static java.lang.String eliminate(java.lang.String string, int start, int end) {
    java.lang.String head = string.substring(0, start);
    java.lang.String foot = "";
    if (end < (string.length())) {
        foot = string.substring((end + 1));
    }
    return head + foot;
}