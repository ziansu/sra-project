public static java.lang.String formatComment(java.lang.String comment, int maxCommentLen) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    int length = 0;
    for (java.lang.String s : comment.split(" ")) {
        length += s.length();
        if (length >= maxCommentLen) {
            sb.append(java.lang.System.getProperty("line.separator"));
            length = 0;
        }
        sb.append(s);
        sb.append(" ");
    }
    return sb.toString();
}