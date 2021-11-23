@org.junit.Test
public void testGetMeetingListWithDate() {
    java.util.List<Meeting> future = manager.getFutureMeetingList(futureDate);
    assertEquals(1, future.size());
    java.util.Set<Contact> one = manager.getContacts(0);
    manager.addFutureMeeting(one, futureDate);
    future = manager.getFutureMeetingList(futureDate);
    assertEquals(2, future.size());
}