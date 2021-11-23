private boolean validOdometerReading(double odometerReading) {
    return (odometerReading >= ((distanceTravelled) + (startDistance))) && (validDistanceValue(odometerReading));
}