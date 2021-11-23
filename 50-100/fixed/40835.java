@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JButton source = ((javax.swing.JButton) (e.getSource()));
    for (int i = 0; i < (view.GameBoard.MAX_TILES); i++) {
        if (source == (view.GameBoard.tiles.get(i))) {
            controller.GameManager.selectedMove = i;
            controller.GameManager.makeMove();
        }
    }
}