@org.junit.jupiter.api.Test
public void testFireAtInvalidCol() {
    edu.oregonstate.cs361.battleship.BattleshipModel test = new edu.oregonstate.cs361.battleship.BattleshipModel();
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String model = gson.toJson(test);
    edu.oregonstate.cs361.battleship.MainTest.TestResponse res = request("POST", "/fire/4/0", model);
    assertEquals(400, res.status);
    assertEquals("Invalid fire location! That shot was off the board.", res.body);
}