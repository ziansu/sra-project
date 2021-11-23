static int moveCarX(boolean inIgnition, int inCarX, int inMoveX) {
    if (inIgnition) {
        if (((inMoveX + inCarX) <= 20) && ((inMoveX + inCarX) >= 1)) {
            inCarX = inMoveX + inCarX;
        }else {
            java.lang.System.out.println("You cannot move the car out of the grid.");
        }
    }else {
        java.lang.System.out.println("You must turn on the ignition.");
    }
    return inCarX;
}