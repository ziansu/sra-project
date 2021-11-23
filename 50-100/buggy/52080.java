public int match(int index, java.util.ArrayList<java.lang.Integer> checking, int[] lastG, int red, int white) {
    int total = red + white;
    if (noperfmatch(checking, lastG, red)) {
        narrow.remove(index);
        return 0;
    }
    if (nomatch(checking, lastG, total)) {
        narrow.remove(index);
        return 0;
    }
    return 1;
}