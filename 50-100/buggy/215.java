private void skipMultiLineComment() {
    while ((!(((input.charAt(pos)) == '*') && ((input.charAt(((pos) + 1))) == '/'))) && ((pos) < (input.length()))) {
        (pos)++;
    } 
    pos += 2;
}