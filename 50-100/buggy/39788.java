private void printIndentation() {
    if ((tabs) < 0) {
        tabs = 0;
    }
    if ((tabs) == 0) {
        return ;
    }
    final int spaces = (tabs) * (indentValue);
    for (int k = 0; k < spaces; k++) {
        result.append(' ');
    }
}