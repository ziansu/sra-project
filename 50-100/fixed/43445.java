public static void main(java.lang.String[] args) {
    conwaysgameoflife.GameOfLifeView game = new conwaysgameoflife.GameOfLifeView();
    game.setLocation((((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width) - (game.getWidth())) / 2), (((java.awt.Toolkit.getDefaultToolkit().getScreenSize().height) - (game.getHeight())) / 2));
    game.setVisible(true);
}