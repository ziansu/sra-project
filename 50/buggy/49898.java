@java.lang.Override
public void autonomousInit() {
    this.autonomousCommand = ((edu.wpi.first.wpilibj.command.Command) (this.chooser.getSelected()));
    this.autonomousCommand.start();
}