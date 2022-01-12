@org.junit.Test
public void createGame() {
    org.amirk.games.connectfour.web.test.dao.Game newGame = new org.amirk.games.connectfour.web.test.dao.Game();
    newGame.setNumberInRowToWin(2);
    newGame.setBoardMatrixJson("hi there");
    this.daoGame.save(newGame);
    java.util.List<org.amirk.games.connectfour.web.test.dao.Game> games = this.daoGame.getList();
    assertNotNull(games);
    assertTrue(((games.size()) > 0));
}