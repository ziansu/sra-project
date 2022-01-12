public byte heatShip(gameplay.models.Coordinates coordinates) {
    if ((checkShot(coordinates)) == 1) {
        map[coordinates.getX()][coordinates.getY()] = 2;
        return 2;
    }else {
        return checkShot(coordinates);
    }
}