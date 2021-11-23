public void reset() {
    for (int i = 0; i < (numberFootstepsToConsider.getIntegerValue()); i++) {
        transferCMPTrajectories.get(i).reset();
        swingCMPTrajectories.get(i).reset();
    }
    transferCMPTrajectories.get(numberFootstepsToConsider.getIntegerValue()).reset();
    activeTrajectory = null;
}