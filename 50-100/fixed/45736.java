@org.junit.Test
public void testIncorrectActionRoom() {
    abandoned.house.Room curRoom = abandoned.entities.test.PinActionTest.house.getRoom("garden");
    abandoned.entities.test.PinActionTest.player.setCurrentRoom(curRoom);
    abandoned.entities.test.PinActionTest.player.setCurrentWall(curRoom.getEastWall());
    abandoned.entities.test.PinActionTest.player.useItem(abandoned.entities.test.PinActionTest.pin, abandoned.entities.test.PinActionTest.house);
    org.junit.Assert.assertNotNull(abandoned.entities.test.PinActionTest.player.getItem("pin"));
}