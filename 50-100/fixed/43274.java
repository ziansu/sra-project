@test.utils.Test
public void validatePassengerNumber() {
    int numOfPassengersLegal = 2;
    int numOfPassengersZero = 0;
    int numOfPassengersNegative = -3;
    int numOfPassengersTooMany = 100;
    assertTrue(main.utils.DataFormatValidator.validatePassengerNumber(numOfPassengersLegal));
    assertFalse(main.utils.DataFormatValidator.validatePassengerNumber(numOfPassengersZero));
    assertFalse(main.utils.DataFormatValidator.validatePassengerNumber(numOfPassengersNegative));
    assertFalse(main.utils.DataFormatValidator.validatePassengerNumber(numOfPassengersTooMany));
}