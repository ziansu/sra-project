public static void playerRepaint() {
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 16; j++) {
            View.Gui.squares[i][j].setBackground(java.awt.Color.GREEN);
            Model.Obstacles.Obstacle();
        }
    }
    View.Gui.squares[Model.Player.playery][Model.Player.playerx].setBackground(java.awt.Color.BLACK);
}