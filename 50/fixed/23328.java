@org.junit.Test
public void testInitializes() {
    gui.TimePanel tp = new gui.TimePanel(new gui.GUI(false), new game.Game(), 15, new javax.swing.JLabel());
    org.junit.Assert.assertNotNull(tp);
    tp.stopTimer();
}