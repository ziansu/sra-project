@test.utils.Test
public void validateDistance() {
    double distanceLegal = 13.0;
    double distanceZero = 0.0;
    double distanceNegative = -10.0;
    double distanceTooLong = 1000.0;
    assertTrue(("Distance is out of range: " + distanceLegal), main.utils.DataFormatValidator.validateDistance(distanceLegal));
    assertFalse(("Distance is out of range: " + distanceZero), main.utils.DataFormatValidator.validateDistance(distanceZero));
    assertFalse(("Destination name is out of range: " + distanceNegative), main.utils.DataFormatValidator.validateDistance(distanceNegative));
    assertFalse(("Destination name is out of range: " + distanceTooLong), main.utils.DataFormatValidator.validateDistance(distanceTooLong));
}