@org.junit.Test
public void testRoomExists() {
    com.conferencemanagement.conference.models.Room r = new com.conferencemanagement.conference.models.Room();
    r.setRoomName("Conference 2");
    r.setCapacity(30);
    r.setDesc("Large video conferencing room (air conditioned)");
    roomDAO.addRoom(r);
    assertEquals(true, roomDAO.roomExists(1, "Conference 2"));
}