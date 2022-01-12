@org.junit.Test
public void testSelectEvent() throws java.sql.SQLException {
    java.sql.Connection conn = startConnection();
    com.teamSmash.Main.createEvent(conn, "event", "place", java.time.LocalTime.now(), java.time.LocalDate.now(), "image", "descrip");
    com.teamSmash.Event event = com.teamSmash.Main.selectEvent(conn, 1);
    assertTrue((event != null));
}