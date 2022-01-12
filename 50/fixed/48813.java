@org.junit.Test
public void testIsItOfficeTime_0659_returnFalse_wrongPinCode() {
    cardSystem.Employee card = new cardSystem.Employee();
    card.setPinCode("1234");
    card.calendar.set(2015, 1, 27, 6, 59);
    assertFalse(card.isItOfficeTime());
}