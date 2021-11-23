@org.junit.Test
public void setgetGame() {
    bustamove.game.Game game = new bustamove.game.Game();
    assertNull(app.getGame());
    app.setGame(game);
    assertEquals(game, app.getGame());
}