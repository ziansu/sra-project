public boolean canMoveTo(int x, int y) {
    java.lang.System.out.println("ROOK::CANMOVETO()");
    if (((super.canMoveTo(x, y)) == true) && ((rookMove(x, y)) == true)) {
        return true;
    }
    java.lang.System.out.println(("Super:Can move to " + (super.canMoveTo(x, y))));
    return false;
}