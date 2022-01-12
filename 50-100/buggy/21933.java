public void autonomousPeriodic() {
    for (org.usfirst.frc.team95.robot.auto.Auto x : runningAutonomousMoves) {
        java.lang.System.out.println(("Running " + (x.getClass().getName())));
        x.update();
        if (x.done()) {
            x.stop();
            runningAutonomousMoves.remove(x);
        }
    }
    java.lang.System.out.println("Auto Periodic");
    move.update();
}