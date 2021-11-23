public void testDeleteEvent() {
    dbh.deleteEvent(1);
    assertEquals(dbh.getEventsCount(), 0);
}