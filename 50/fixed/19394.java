@org.junit.jupiter.api.Test
public void testGetModel() {
    edu.oregonstate.cs361.battleship.MainTest.TestResponse res = request("GET", "/model", null);
    assertEquals(200, res.status);
}