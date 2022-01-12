@org.junit.Test
public void TestBloodyStupidJohnsonEvent() {
    GameEngine ge = new GameEngine();
    ge.DetermineFirstPlayer();
    int CurrentPlayerIndex = ge.GetCurrentPlayer();
    EventCards StupidJohnson = new EventCards("Bloody Stupid Johnson", 1, true, CardType.CityAreaCards);
    boolean Success = ge.PlayEvent(StupidJohnson, CurrentPlayerIndex, true);
    int areaAffected = ge.GetBoardDie();
    assertTrue("Failed executing Bloody Stupid Johnson event", Success);
}