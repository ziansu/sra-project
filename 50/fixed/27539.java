private void right() throws CIT260.crashInTheCaribbean.exceptions.HowToMoveException {
    CIT260.crashInTheCaribbean.control.MoveControl controlMove = new CIT260.crashInTheCaribbean.control.MoveControl();
    int movPlayer = controlMove.controlMove(R, boost);
    java.lang.System.out.println((("You moved to the right " + movPlayer) + " places"));
}