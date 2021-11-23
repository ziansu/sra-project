private boolean isLeaf(int pos) {
    if ((pos >= ((size) / 2)) && (pos <= (size))) {
        return true;
    }
    return false;
}