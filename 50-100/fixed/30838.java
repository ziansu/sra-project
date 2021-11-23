public com.mygdx.bombertruckbackend.Maplocation getLocation(int x, int y) {
    if ((map) == null) {
        return null;
    }else
        if ((((((mapSizeX) - 1) < x) || (x < 0)) || (((mapSizeY) - 1) < y)) || (y < 0)) {
            return null;
        }else {
            return map[x][y];
        }
    
}