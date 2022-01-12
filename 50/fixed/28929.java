@org.junit.Test
public void testAccessGranted_weekDay_officeHours_pinCorrect_suspended_returnsFalse() {
    cardSystem.Employee card = new cardSystem.Employee();
    card.calendar.set(2015, 1, 26, 10, 0);
    card.setCardSuspended(true);
    assertFalse(card.accessGranted());
}