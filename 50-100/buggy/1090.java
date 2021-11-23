private main.java.Position tilePosConverter(main.java.Position tilePos) {
    int tileX = tilePos.getX();
    int tileY = tilePos.getY();
    int middlePosX = ((tileX * (main.java.Game.tileSize)) - 1) + ((main.java.Game.tileSize) - (1 / 2));
    int middlePosY = ((tileY * (main.java.Game.tileSize)) - 1) + ((main.java.Game.tileSize) - (1 / 2));
    return new main.java.Position(middlePosX, middlePosY);
}