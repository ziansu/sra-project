@org.junit.Test
public void testCorrectActionWall() {
    abandoned.house.Room curRoom = abandoned.entities.test.HandleActionTest.house.getRoom("kitchen");
    abandoned.house.Wall curWall = curRoom.getEastWall();
    abandoned.entities.test.HandleActionTest.player.setCurrentRoom(curRoom);
    abandoned.entities.test.HandleActionTest.player.setCurrentWall(curWall);
    abandoned.entities.test.HandleActionTest.player.useItem(abandoned.entities.test.HandleActionTest.handle, abandoned.entities.test.HandleActionTest.house);
    org.junit.Assert.assertNull(abandoned.entities.test.HandleActionTest.player.getItem("handle"));
    abandoned.house.Container cabinet = curWall.getContainer("cabinet");
    org.junit.Assert.assertNotNull(cabinet.getItem("knife"));
    abandoned.entities.test.HandleActionTest.player.addItem(abandoned.entities.test.HandleActionTest.handle);
}