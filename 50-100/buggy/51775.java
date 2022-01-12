public java.lang.Boolean isNewFull() {
    java.lang.Boolean state = ((((leftLine.getIsMarked()) && (upperLine.getIsMarked())) && (rightLine.getIsMarked())) && (bottomLine.getIsMarked())) && (!(marked));
    if (isBoxFull()) {
        marked = true;
    }
    return state;
}