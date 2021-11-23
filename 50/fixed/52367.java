@org.junit.Test
public void testAccessGranted_weekend_officeHours_pinWrong_returnsFalse() {
    cardSystem.Employee card = new cardSystem.Employee();
    card.calendar.set(2015, 1, 28, 10, 0);
    card.setPinCode("notCorrect");
    assertFalse(card.accessGranted());
}