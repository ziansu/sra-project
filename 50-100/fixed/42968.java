public boolean isGoalState(boolean playerIsWhite, byte ySize) {
    if (playerIsWhite) {
        for (Position aWhite : white) {
            if ((aWhite.y) == ySize) {
                return true;
            }
        }
        return false;
    }else {
        for (Position aBlack : black) {
            if ((aBlack.y) == ((byte) (1))) {
                return true;
            }
        }
        return false;
    }
}