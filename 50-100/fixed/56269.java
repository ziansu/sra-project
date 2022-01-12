@org.junit.Test
public void updateEntryTest() throws seedu.multitasky.model.entry.exceptions.DuplicateEntryException, seedu.multitasky.model.entry.exceptions.EntryNotFoundException {
    seedu.multitasky.model.entry.EventList eventListToTest = createEventList1();
    try {
        eventListToTest.updateEntry(seedu.multitasky.model.entry.EventListTest.sampleEvents[0], seedu.multitasky.model.entry.EventListTest.sampleEvents[3]);
        org.junit.Assert.assertTrue(eventList1.asObservableList().get(0).equals(seedu.multitasky.model.entry.EventListTest.sampleEvents[3]));
    } catch (seedu.multitasky.model.entry.exceptions.DuplicateEntryException e) {
        org.junit.Assert.fail("EventListTest.updateEntryTest() failed due to duplicate entry.");
    }
}