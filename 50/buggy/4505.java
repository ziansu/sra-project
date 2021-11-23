@org.junit.Test
public void checkBuildingId() {
    edu.vt.ece5574.agents.User user = new edu.vt.ece5574.agents.User("1", "0");
    user.setBuildingID("5000");
    assertEquals(user.getBuildingID(), 5000);
}