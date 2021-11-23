private void setInitialKings() {
    Game.Figure.King black = new Game.Figure.King(Game.Player.Colour.BLACK);
    Game.Figure.King white = new Game.Figure.King(Game.Player.Colour.WHITE);
    field[0][4].setFigure(white);
    field[7][4].setFigure(black);
}