@test.utils.Test
public void validateDestinationID() {
    int idLegal = 400;
    int idZero = 0;
    int idNegative = -3;
    assertTrue(("ID out of range: " + idLegal), main.utils.DataFormatValidator.validateDestinationID(idLegal));
    assertFalse(("ID out of range: " + idZero), main.utils.DataFormatValidator.validateDestinationID(idZero));
    assertFalse(("ID out of range: " + idNegative), main.utils.DataFormatValidator.validateDestinationID(idNegative));
}