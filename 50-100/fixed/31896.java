public void teleopPeriodic() {
    mDrive.mecanumDrive_Cartesian(((stick.getX()) * 0.5), ((stick.getY()) * 0.5), ((stick.getTwist()) * 0.5), 0);
    climber.operate();
    gearHanger.hangGear(0.5);
}