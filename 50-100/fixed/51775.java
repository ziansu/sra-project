public java.lang.Boolean isNewFull() {
    if (!(marked)) {
        if ((((leftLine.getIsMarked()) && (upperLine.getIsMarked())) && (rightLine.getIsMarked())) && (bottomLine.getIsMarked())) {
            marked = true;
        }
        return marked;
    }
    return false;
}