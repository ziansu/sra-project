@org.junit.Test
public void testCancelTimer() {
    gui.GUI gui = new gui.GUI(false);
    game.Game game = new game.Game();
    gui.TimePanel tp = new gui.TimePanel(gui, game, 3, new javax.swing.JLabel());
    game.setWinner(Owner.Player1);
    try {
        java.lang.Thread.sleep(3500);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    org.junit.Assert.assertEquals(Owner.Player1, game.getWinner());
    tp.stopTimer();
}