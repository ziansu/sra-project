@org.junit.Test
public void testAccessGranted_weekDay_notOfficeHours_pinCorrect_notSuspended_returnsTrue() {
    cardSystem.Employee card = new cardSystem.Employee();
    card.calendar.set(2015, 1, 26, 5, 0);
    assertTrue(card.accessGranted());
}