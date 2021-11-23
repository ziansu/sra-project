public static java.lang.String shortify(java.lang.String text) {
    int maxlength = 22;
    if ((text.length()) <= maxlength) {
        return text;
    }else {
        return (text.substring(0, (maxlength + 1))) + "...";
    }
}