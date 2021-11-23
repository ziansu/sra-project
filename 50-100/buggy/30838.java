public com.mygdx.bombertruckbackend.Maplocation getLocation(int x, int y) {
    if ((map) == null) {
        return null;
    }else
        if (((((mapSizeX) < x) || (x < 0)) || ((mapSizeY) < y)) || (y < 0)) {
            return null;
        }else {
            return map[x][y];
        }
    
}