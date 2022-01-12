public double slopeTo(Point that) {
    if ((this.x) == (that.x)) {
        if ((that.y) == (this.y))
            return java.lang.Double.NEGATIVE_INFINITY;
        else
            return java.lang.Double.POSITIVE_INFINITY;
        
    }else
        if ((this.y) == (that.y))
            return 0;
        else
            return (1.0 * ((that.y) - (this.y))) / ((that.x) - (this.x));
        
    
}