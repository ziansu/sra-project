@org.junit.Test
public void testIsItWeekDay_notWeekDay_returnFalse() {
    cardSystem.Employee card = new cardSystem.Employee();
    card.setPinCode("notCorrect");
    card.calendar.set(2015, 1, 28, 10, 0);
    assertFalse(card.isItOfficeTime());
}