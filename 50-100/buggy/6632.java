@com.laboon.Test
public void testGetCurrentRoomInfo() {
    com.laboon.Room mockRoom = org.mockito.Mockito.Mockito.mock(com.laboon.Room.class);
    com.laboon.mockRoom[] mockRoomArray = new com.laboon.mockRoom[1];
    mockRoom.when(mockRoom.getDescription());
    thenReturn("hi");
    com.laboon.House houseTester = new com.laboon.House(mockRoomArray);
    assertEquals(houseTester.getCurrentRoomInfo(), "hi");
}