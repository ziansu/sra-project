private void skipMultiLineComment() {
    pos += 2;
    while ((!(((input.charAt(pos)) == '*') && ((input.charAt(((pos) + 1))) == '/'))) && ((pos) < (input.length()))) {
        (pos)++;
    } 
    pos += 2;
}