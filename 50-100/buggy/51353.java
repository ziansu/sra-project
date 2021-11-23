public void loop() {
    if ((foundLine) && ((teamWeAreOn) != (Team.UNKNOWN)))
        telemetry.addData("On team:", teamWeAreOn.toString());
    
    if (!(foundLine)) {
        moveTillLine();
    }else
        if (!(robotFirstTurn)) {
            turnToBeacon(this.time);
        }else {
            double d = getDistance();
            telemetry.addData("Distance", d);
            if (d < (DISTANCE_FROM_WALL)) {
                stopMoving();
            }
        }
    
}