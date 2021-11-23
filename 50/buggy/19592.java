public int getRow() {
    if ((top) == null) {
        return 1;
    }else {
        return (top.getRow()) + 1;
    }
}