private int getDepth(java.lang.String line) {
    int depth = 1;
    for (int i = 0; i < (line.length()); i++) {
        if (((line.charAt(i)) == '\t') || ((line.charAt(i)) == ' ')) {
            depth++;
        }else {
            break;
        }
    }
    return depth;
}