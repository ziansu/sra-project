public void init(java.awt.Point[] carPosition, java.awt.Point[] environment1Position, java.awt.Point[] environment2Position, float edgeOfStreet, int parkingPlaceType) {
    this.carPosition = carPosition;
    this.environment1Position = environment1Position;
    this.environment2Position = environment2Position;
    this.parkingPlaceType = parkingPlaceType;
    this.edgeOfStreet = edgeOfStreet;
    if (parkingPlaceType == (ParkingPilot.Util.ParkingCalculator.MODIFY_HORIZONTAL)) {
        carAngle = 0;
    }else
        if (parkingPlaceType == (ParkingPilot.Util.ParkingCalculator.MODIFY_VERTICAL_LEFT)) {
            carAngle = 90;
        }
    
}