public boolean heatShip(gameplay.models.Coordinates coordinates) {
    if (checkShot(coordinates)) {
        map[coordinates.getX()][coordinates.getY()] = 2;
        return true;
    }else {
        map[coordinates.getX()][coordinates.getY()] = -1;
        return false;
    }
}