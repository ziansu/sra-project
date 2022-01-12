private boolean isStartOfBlockComment(java.lang.String input, int position) {
    char current = input.charAt(position);
    if (current == '/') {
        if (position < ((input.length()) - 1)) {
            if ((input.charAt((position + 1))) == '*') {
                return true;
            }
        }
    }
    return false;
}