public boolean canMoveTo(int x, int y) {
    if (((super.canMoveTo(x, y)) == true) && ((rookMove(x, y)) == true)) {
        return true;
    }else {
        return false;
    }
}