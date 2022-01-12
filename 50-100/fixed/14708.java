public void autoGearShift() {
    if ((gearCounter) == 10) {
        double sum = 0;
        for (int i = 0; i < (currents.length); i++) {
            sum += currents[i];
        }
        gearUp = (sum / (currents.length)) > (edu.stuy.robot.RobotMap.GEAR_SHIFT_THRESHOLD);
        gearShift.set(gearUp);
        gearCounter = 0;
    }else {
        currents[gearCounter] = getAverageCurrent();
        (gearCounter)++;
    }
}