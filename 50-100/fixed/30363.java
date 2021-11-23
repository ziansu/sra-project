private void pickupArmsLower() {
    while ((!(bottomLimitReached)) && (bottomLimit.get())) {
        setPickupMotors((-1.0));
        org.usfirst.frc.team1787.robot.Timer.delay(0.1);
        if (!(bottomLimit.get())) {
            bottomLimitReached = true;
        }
    } 
    topLimitReached = false;
    setPickupMotors(0);
}