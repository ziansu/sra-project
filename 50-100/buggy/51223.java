protected void execute() {
    switch (org.ingrahamrobotics.robot2015.state.ToteIntakeState.getCurrentDirection()) {
        case IN :
            if (goingIn) {
                setDirection(IntakeDirection.STOPPED);
            }else {
                setDirection(IntakeDirection.OUT);
            }
            break;
        case OUT :
            if (goingIn) {
                setDirection(IntakeDirection.STOPPED);
            }else {
                setDirection(IntakeDirection.OUT);
            }
            break;
        case STOPPED :
            if (goingIn) {
                setDirection(IntakeDirection.IN);
            }else {
                setDirection(IntakeDirection.OUT);
            }
            break;
    }
    finished = true;
}