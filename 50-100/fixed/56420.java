public void setGear(competition.subsystems.shift.ShiftSubsystem.Gear gear) {
    if (gear == (competition.subsystems.shift.ShiftSubsystem.Gear.LOW_GEAR)) {
        solenoid.set(false);
    }else
        if (gear == (competition.subsystems.shift.ShiftSubsystem.Gear.HIGH_GEAR)) {
            solenoid.set(true);
        }else {
            solenoid.set(false);
        }
    
    this.gear = gear;
}