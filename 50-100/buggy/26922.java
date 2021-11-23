public int compareTo(Point that) {
    if ((this.x) < (that.y))
        return -1;
    
    if ((this.x) > (that.y))
        return +1;
    
    if ((this.y) < (that.y))
        return -1;
    
    if ((this.y) > (that.y))
        return +1;
    
    return 0;
}