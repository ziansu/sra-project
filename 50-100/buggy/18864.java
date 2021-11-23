@java.lang.Override
public void autonomousInit() {
    autonomousCommand = autoChooser.getSelected();
    autonomousNumber = com.github.adambots.steamworks2017.auton.SendableChooserValue.getBackupNumber();
    backupNumber = com.github.adambots.steamworks2017.auton.SendableChooserValue.getNumber();
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    state = "auton";
    com.github.adambots.steamworks2017.networkTables.NetworkTables.getControlsTable().putBoolean("auton", true);
}