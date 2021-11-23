@org.junit.Test
public void testCreateEvent() throws java.sql.SQLException {
    java.sql.Connection conn = startConnection();
    int affected = com.teamSmash.Main.createEvent(conn, "event", "place", java.time.LocalTime.now(), java.time.LocalDate.now(), "image", "descrip", 1);
    endConnection(conn);
    assertTrue((affected == 1));
}