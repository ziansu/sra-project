@java.lang.Override
public void autonomousInit() {
    this.autonomousCommand = ((edu.wpi.first.wpilibj.command.Command) (this.chooser.getSelected()));
    if ((this.autonomousCommand) != null) {
        this.autonomousCommand.start();
    }
}