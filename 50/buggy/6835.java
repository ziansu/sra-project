protected void execute() {
    double output = Robot.instance.oi.getShooterElevatorInput();
    if ((output > 0) && (!(Robot.instance.elevator.limitSwitch.get()))) {
        output = 0;
    }
    Robot.instance.elevator.elevatorActuator.set(output);
}