private void left() throws CIT260.crashInTheCaribbean.exceptions.HowToMoveException {
    CIT260.crashInTheCaribbean.control.MoveControl controlMove = new CIT260.crashInTheCaribbean.control.MoveControl();
    int movPlayer = controlMove.controlMove(L, boost);
    java.lang.System.out.println((("You moved to the left " + movPlayer) + " places"));
}