private char nextChar() {
    if ((_offset) < (_string.length())) {
        ch = _string.charAt(_offset);
        if ((ch) == '\n') {
            (_line)++;
            _column = 0;
        }
        (_offset)++;
        (_column)++;
    }else {
        ch = ' ';
    }
    return ch;
}