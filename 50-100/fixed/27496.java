public void teleopPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    java.lang.Object color = ledChooser.getSelected();
    if ((color != null) && (color instanceof edu.wpi.first.wpilibj.command.Command)) {
        funCommand = ((edu.wpi.first.wpilibj.command.Command) (color));
        funCommand.start();
    }
    log();
}