public static int count(java.lang.String content, char charForSearch) {
    int count = 0;
    int contentLength = content.length();
    for (int i = 0; i < contentLength; i++) {
        if (charForSearch == (content.charAt(i))) {
            count++;
        }
    }
    return count;
}