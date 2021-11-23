@org.junit.Test
public void testAccessGranted_weekDay_officeHours_pinWrong_notSuspended_returnsTrue() {
    cardSystem.Employee card = new cardSystem.Employee();
    card.calendar.set(2015, 1, 26, 10, 0);
    card.setPinCode("notCorrect");
    assertTrue(card.accessGranted());
}