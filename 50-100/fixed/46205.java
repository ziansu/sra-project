@org.junit.Test
public void testIncorrectActionWall() {
    abandoned.house.Room curRoom = abandoned.entities.test.HandleActionTest.house.getRoom("kitchen");
    abandoned.entities.test.HandleActionTest.player.setCurrentRoom(curRoom);
    abandoned.entities.test.HandleActionTest.player.setCurrentWall(curRoom.getWestWall());
    abandoned.entities.test.HandleActionTest.player.useItem(abandoned.entities.test.HandleActionTest.handle, abandoned.entities.test.HandleActionTest.house);
    org.junit.Assert.assertNotNull(abandoned.entities.test.HandleActionTest.player.getItem("handle"));
}