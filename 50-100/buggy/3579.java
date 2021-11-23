@org.junit.Test
public void announcesXWinner() {
    play.twirl.api.Content html = views.html.game.render("Let's Play!", new uk.nickbdyer.tictactoe.Board().getCells(), uk.nickbdyer.tictactoe.Mark.X, false, true);
    org.junit.Assert.assertEquals("text/html", html.contentType());
    org.junit.Assert.assertTrue(html.body().contains("X is the winner!!"));
}