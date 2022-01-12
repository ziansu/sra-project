public boolean checkStep(int x, int y) {
    if ((x < (this.width)) || (x >= (this.height))) {
        return false;
    }else
        if ((y < (this.height)) || (y >= (this.height))) {
            return false;
        }else
            if ((matrix.data[x][y]) > 0) {
                return false;
            }else
                return true;
            
        
    
}