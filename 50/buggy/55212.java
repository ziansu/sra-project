public void testDeleteEvent() {
    dbh.deleteEvent(testEventUpdate);
    assertEquals(dbh.getEventsCount(), 0);
}