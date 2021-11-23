public void moveTo(double positionInMillimeter) {
    activMotor = true;
    double countOfNumerator = calculator.getCountOfNumerator((positionInMillimeter / (de.dennismaass.emp.stonemaster.stackmaster.controller.comport.communicator.ComCommunicator.FACTOR_CM_TO_MM)));
    int countOfNumeratorInt = ((int) (java.lang.Math.rint(countOfNumerator)));
    java.lang.System.err.println(("COUNTOFNUMERATORINT " + countOfNumeratorInt));
    send(1, ComInstructionID.MOVE_POSITION, ComInstructionID.MOVE_POSITION_ABSOLUTE, 0, countOfNumeratorInt);
}