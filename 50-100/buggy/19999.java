public static com.example.vincentzhang.Sprite.Vector2D worldToGrid(com.example.vincentzhang.Sprite.Vector2D worldPos) {
    double worldPosX = worldPos.getX();
    double worldPosY = worldPos.getY();
    double gridIdX = (worldPosX * 2) / (com.example.vincentzhang.Sprite.CoordinateSystem.tileDimension.getX());
    double gridIdY = (worldPosY / (com.example.vincentzhang.Sprite.CoordinateSystem.tileDimension.getY())) + gridIdX;
    return new com.example.vincentzhang.Sprite.Vector2D(gridIdX, gridIdY);
}