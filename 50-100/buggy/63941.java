private boolean inXRange(float x) {
    if ((this.x) == x)
        return true;
    
    if (((this.x) > x) && (x < ((this.x) + ((length) / 2))))
        return true;
    
    if (((this.x) < x) && (x > ((this.x) - ((length) / 2))))
        return true;
    
    return false;
}