@org.junit.Test
public void testUpdate() {
    gui.TimePanel tp = new gui.TimePanel(new gui.GUI(false), new game.Game(), 15, new javax.swing.JLabel());
    try {
        java.lang.Thread.sleep(500);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    org.junit.Assert.assertEquals((((("<html> <b>" + 0) + ":") + 14) + "</b> </html>"), tp.getTimerLabel().getText());
    tp.stopTimer();
}