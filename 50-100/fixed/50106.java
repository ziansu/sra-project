public boolean contains(double x, double y) {
    if (((((this.x) - x) * ((this.x) - x)) + (((this.y) - y) * ((this.y) - y))) < ((this.radius) * (this.radius)))
        return true;
    else
        return false;
    
}