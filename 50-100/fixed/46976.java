@test.utils.Test
public void validateDistance() {
    double distanceLegal = 13.0;
    double distanceZero = 0.0;
    double distanceNegative = -10.0;
    double distanceTooLong = 1000.0;
    assertTrue(main.utils.DataFormatValidator.validateDistance(distanceLegal));
    assertFalse(main.utils.DataFormatValidator.validateDistance(distanceZero));
    assertFalse(main.utils.DataFormatValidator.validateDistance(distanceNegative));
    assertFalse(main.utils.DataFormatValidator.validateDistance(distanceTooLong));
}