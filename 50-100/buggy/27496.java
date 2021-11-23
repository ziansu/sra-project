public void teleopPeriodic() {
    try {
        edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Exception");
    }
    java.lang.Object color = ledChooser.getSelected();
    if ((color != null) && (color instanceof edu.wpi.first.wpilibj.command.Command)) {
        funCommand = ((edu.wpi.first.wpilibj.command.Command) (color));
        funCommand.start();
    }
    log();
}