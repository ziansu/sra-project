private double Consume(int Xtile, int Ytile, double DesiredFood) {
    if (Map.tiles[Xtile][Ytile].isWaterTile) {
        return 0;
    }else {
        return Map.tiles[Xtile][Ytile].eatFoodTile(DesiredFood);
    }
}