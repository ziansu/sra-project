public boolean contains(double x, double y) {
    if ((((x < ((this.x) + (radius))) && (x > ((this.x) - (radius)))) && (y < ((this.y) + (radius)))) && (y > ((this.y) - (radius))))
        return true;
    else
        return false;
    
}