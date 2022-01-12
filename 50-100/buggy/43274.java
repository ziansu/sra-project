@test.utils.Test
public void validatePassengerNumber() {
    int numOfPassengersLegal = 2;
    int numOfPassengersZero = 0;
    int numOfPassengersNegative = -3;
    int numOfPassengersTooMany = 100;
    assertTrue(("Passengers Number out of range" + numOfPassengersLegal), main.utils.DataFormatValidator.validatePassengerNumber(numOfPassengersLegal));
    assertFalse(("Passengers Number out of range" + numOfPassengersZero), main.utils.DataFormatValidator.validatePassengerNumber(numOfPassengersZero));
    assertFalse(("Passengers Number out of range" + numOfPassengersNegative), main.utils.DataFormatValidator.validatePassengerNumber(numOfPassengersNegative));
    assertFalse(("Passengers Number out of range" + numOfPassengersTooMany), main.utils.DataFormatValidator.validatePassengerNumber(numOfPassengersTooMany));
}