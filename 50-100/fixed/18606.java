public void addTrackers() {
    org.usfirst.frc.team2473.framework.components.Trackers.getInstance().addTracker(new org.usfirst.frc.team2473.framework.trackers.TalonTracker("motorc", 6, org.usfirst.frc.team2473.framework.trackers.TalonTracker.Target.CURRENT));
    org.usfirst.frc.team2473.framework.components.Trackers.getInstance().addTracker(new org.usfirst.frc.team2473.framework.trackers.TalonTracker("motorp", 6, org.usfirst.frc.team2473.framework.trackers.TalonTracker.Target.POWER));
    org.usfirst.frc.team2473.framework.components.Trackers.getInstance().addTracker(new org.usfirst.frc.team2473.framework.trackers.TalonTracker("motors", 6, org.usfirst.frc.team2473.framework.trackers.TalonTracker.Target.SPEED));
    org.usfirst.frc.team2473.framework.components.Trackers.getInstance().addTracker(new org.usfirst.frc.team2473.framework.trackers.EncoderTracker("motore", 6));
}