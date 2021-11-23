@test.utils.Test
public void validateDestinationID() {
    int idLegal = 400;
    int idZero = 0;
    int idNegative = -3;
    assertTrue(main.utils.DataFormatValidator.validateDestinationID(idLegal));
    assertFalse(main.utils.DataFormatValidator.validateDestinationID(idZero));
    assertFalse(main.utils.DataFormatValidator.validateDestinationID(idNegative));
}