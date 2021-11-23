private boolean validOdometerReading(double odometerReading) {
    return (odometerReading >= (startDistance)) && (validDistanceValue(odometerReading));
}