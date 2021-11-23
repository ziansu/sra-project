public static java.util.List paserLineEnd(java.lang.String content) {
    java.util.List<java.lang.Integer> lines = new java.util.ArrayList<java.lang.Integer>();
    int length = content.length();
    for (int i = 0; i < length; i++) {
        if ((content.charAt(i)) == '\n') {
            lines.add(i);
        }
    }
    return lines;
}