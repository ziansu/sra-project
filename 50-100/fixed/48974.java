private void nextChar() {
    if ((i) < (source.length())) {
        ch = source.charAt(i);
        if ((ch) == '\n') {
            (line)++;
            column = 0;
        }else {
            (column)++;
        }
        i = (i) + 1;
    }else {
        ch = ' ';
    }
}