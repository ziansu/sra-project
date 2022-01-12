@java.lang.Override
public void paint(java.awt.Graphics theGraphic) {
    super.paint(theGraphic);
    game.validate();
    game.repaint();
    selectPanel.revalidate();
    selectPanel.repaint();
    board.revalidate();
    board.repaint();
    stratPanel.revalidate();
    stratPanel.repaint();
    descriptionPanel.revalidate();
    descriptionPanel.repaint();
}