public void setTargetHeading(int targetHeading, de.aw.atcc.aircraft.FlightDirection turnDirection) {
    this.targetHeading = targetHeading;
    switch (turnDirection) {
        case Left :
            turnAngle = ((360 + (currentHeading)) - targetHeading) % 360;
            break;
        case Right :
            turnAngle = ((360 + targetHeading) - (currentHeading)) % 360;
    }
    this.turnDirection = turnDirection;
}