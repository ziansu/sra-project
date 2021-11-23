public static com.example.vincentzhang.Sprite.Vector2D worldToGrid(com.example.vincentzhang.Sprite.Vector2D worldPos) {
    double worldPosX = worldPos.getX();
    double worldPosY = worldPos.getY();
    int gridIdX = ((int) ((worldPosX * 2) / (com.example.vincentzhang.Sprite.CoordinateSystem.tileDimension.getX())));
    int gridIdY = ((int) ((worldPosY / (com.example.vincentzhang.Sprite.CoordinateSystem.tileDimension.getY())) + (gridIdX / 2)));
    return new com.example.vincentzhang.Sprite.Vector2D(gridIdX, gridIdY);
}