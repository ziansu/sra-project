private void nextChar() {
    if ((i) < (source.length())) {
        ch = source.charAt(i);
        if ((ch) == '\n') {
            (line)++;
            column = 0;
        }
        i = (i) + 1;
        column = (column) + 1;
    }else {
        ch = ' ';
    }
}