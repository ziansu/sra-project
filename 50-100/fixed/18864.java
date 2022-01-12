@java.lang.Override
public void autonomousInit() {
    autonomousCommand = autoChooser.getSelected();
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    autonomousNumber = autoChooser.getSelected().getNumber();
    backupNumber = autoChooser.getSelected().getBackupNumber();
    state = "auton";
    com.github.adambots.steamworks2017.networkTables.NetworkTables.getControlsTable().putBoolean("auton", true);
}