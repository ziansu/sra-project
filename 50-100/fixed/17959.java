private int rotZ(int x, int z) {
    if ((rotation) == 90) {
        return 15 - x;
    }else
        if (((rotation) == (-90)) || ((rotation) == 270)) {
            return x;
        }else
            if (((rotation) == 180) || ((rotation) == (-180))) {
                return 15 - z;
            }
        
    
    return z;
}