protected boolean isFinished() {
    if (OI.btnDriveLock.get()) {
        return false;
    }
    if ((OI.btnAlignLock.get()) && (!((OI.btnDriveLock.get()) || (OI.btnUnjam.get())))) {
        return org.usfirst.frc.team4183.utils.CommandUtils.stateChange(this, new org.usfirst.frc.team4183.robot.commands.DriveSubsystem.AlignLock());
    }else {
        return org.usfirst.frc.team4183.utils.CommandUtils.stateChange(this, new org.usfirst.frc.team4183.robot.commands.DriveSubsystem.DriverControl());
    }
}