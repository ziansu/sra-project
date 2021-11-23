boolean setMapSize(int x, int y) {
    if ((x < 2) || (x > 8)) {
        return false;
    }else {
        if ((x > 4) && (y < 8)) {
            return false;
        }else
            if ((y > 50) || (y < 5)) {
                return false;
            }
        
    }
    size = y;
    return true;
}