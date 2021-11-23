@org.junit.Test
public void testIsItWeekDay_returnTrue() {
    cardSystem.Employee card = new cardSystem.Employee();
    card.setPinCode("notCorrect");
    card.calendar.set(2015, 2, 26, 10, 0);
    assertTrue(card.isItOfficeTime());
}