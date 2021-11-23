@org.junit.Test
public void testIncorrectActionWall() {
    abandoned.house.Room curRoom = abandoned.entities.test.PinActionTest.house.getRoom("bedroom");
    abandoned.house.Wall curWall = curRoom.getNorthWall();
    abandoned.entities.test.PinActionTest.player.setCurrentRoom(curRoom);
    abandoned.entities.test.PinActionTest.player.setCurrentWall(curWall);
    abandoned.entities.test.PinActionTest.player.useItem(abandoned.entities.test.PinActionTest.pin, abandoned.entities.test.PinActionTest.house);
    org.junit.Assert.assertNotNull(abandoned.entities.test.PinActionTest.player.getItem("pin"));
}