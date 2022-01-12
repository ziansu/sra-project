public void up(int level) {
    levelIndex = level;
    capLiftLevel();
    forkliftPID.setDesiredValue(encoderLevels[levelIndex]);
    forkliftMotor.set(forkliftPID.calcPID(forkliftEncoder.get()));
    while (forkliftPID.isDone()) {
        forkliftMotor.set(forkliftPID.calcPID(forkliftEncoder.get()));
    } 
    stop();
}