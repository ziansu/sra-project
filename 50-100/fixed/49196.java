@rougelikeLibrary.Test
public void testTurnSystemEnterDoor() {
    rougelikeLibrary.TurnSystem ts = new rougelikeLibrary.TurnSystem(new rougelikeLibrary.EnemyAI(2));
    java.lang.Character c = new java.lang.Character(5, 0, 0, 1, 1, ts);
    rougelikeLibrary.Room r = new rougelikeLibrary.Room(new rougelikeLibrary.WorldPosition(0, 0), new rougelikeLibrary.RoomSpace(2, 2));
    assertTrue(c.startTurn(r));
}