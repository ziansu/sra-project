private void left() {
    CIT260.crashInTheCaribbean.control.MoveControl controlMove = new CIT260.crashInTheCaribbean.control.MoveControl();
    try {
        int movPlayer = controlMove.controlMove(L, boost);
    } finally {
    }
    java.lang.System.out.println((("You moved to the left " + (movPlayer)) + " places"));
}