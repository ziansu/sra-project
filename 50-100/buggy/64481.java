private boolean validMove(int id, int id2, int n1, int n2) {
    if (id == id2) {
        makeSmall();
        return false;
    }
    if ((n1 != n2) && ((java.lang.Math.abs((n1 - n2))) != 1)) {
        makeSmall();
        return false;
    }
    return true;
}