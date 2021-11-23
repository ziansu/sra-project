public void move(double millimeter) {
    activMotor = true;
    double countOfNumerator = calculator.getCountOfNumerator((millimeter / (de.dennismaass.emp.stonemaster.stackmaster.controller.comport.communicator.ComCommunicator.FACTOR_CM_TO_MM)));
    int countOfNumeratorInt = ((int) (java.lang.Math.rint(countOfNumerator)));
    send(1, ComInstructionID.MOVE_POSITION, ComInstructionID.MOVE_POSITION_RELATIVE, 0, countOfNumeratorInt);
}