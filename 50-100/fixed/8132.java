@dataClasses.Test
public void testCalculateFare() {
    double pricePerFifthMile = 0.5;
    double totalFare = 0.0;
    double overTwoPassengerCharge = 2.0;
    double dropOffCharge = 2.5;
    double distance = 10.5;
    int numberOfPassengers = 5;
    if (numberOfPassengers > 2) {
        totalFare = overTwoPassengerCharge * (numberOfPassengers - 2);
    }
    totalFare += dropOffCharge;
    totalFare += distance * pricePerFifthMile;
    assertEquals(13.75, totalFare, 0.1);
}