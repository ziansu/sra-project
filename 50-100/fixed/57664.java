public void mouseClicked(java.awt.event.MouseEvent e) {
    if ((main.Game.Board.button2.isEnabled()) == true) {
        if ((main.Game.Board.panel2.n) >= 23) {
            javax.swing.JOptionPane.showMessageDialog(null, "You are out of cards", "Can't ask cards anymore!!!", javax.swing.JOptionPane.ERROR_MESSAGE);
        }else {
            main.Game.Board.panel2.DealMyCard();
            main.Game.Board.panel2.ropeup = true;
            panel.setRope();
            main.Game.Board.panel2.switchSide();
            main.Game.Board.button2.setEnabled(false);
        }
    }
}