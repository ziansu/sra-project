public void move(double millimeter) {
    activMotor = true;
    double countOfNumerator = calculator.getCountOfNumerator(millimeter);
    int countOfNumeratorInt = ((int) (java.lang.Math.rint(countOfNumerator)));
    send(1, ComInstructionID.MOVE_POSITION, ComInstructionID.MOVE_POSITION_RELATIVE, 0, countOfNumeratorInt);
}