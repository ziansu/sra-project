public void down(int level) {
    levelIndex = level;
    capLiftLevel();
    forkliftPID.setDesiredValue(encoderLevels[levelIndex]);
    while (forkliftPID.isDone()) {
        forkliftMotor.set(forkliftPID.calcPID(forkliftEncoder.get()));
    } 
    stop();
}