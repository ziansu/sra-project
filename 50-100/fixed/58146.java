private boolean isStartOfLineComment() {
    char current = input.charAt(position);
    if (current == '#') {
        return true;
    }else
        if (current == '/') {
            if ((position) < ((input.length()) - 1)) {
                if ((input.charAt(((position) + 1))) == '/') {
                    return true;
                }
            }
        }
    
    return false;
}