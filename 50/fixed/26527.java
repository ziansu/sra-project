@java.lang.Override
protected void execute() {
    java.lang.System.out.println("setting Speed for Intake");
    Robot.intakeLauncher.setSpeedIntake();
    Robot.portcullis.PortcullisBarIn();
}