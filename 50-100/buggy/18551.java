@org.junit.Test
public void PlayerGetBattleField() throws java.lang.Exception {
    group5.battleship.src.logic.Player p1 = new group5.battleship.src.logic.Player("p1");
    int[][] bla = p1.getBattleField();
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            org.junit.Assert.assertEquals(pl.getBattleFieldByCordinate(new group5.battleship.src.logic.Cordinate(i, j)), bla[i][j]);
        }
    }
}