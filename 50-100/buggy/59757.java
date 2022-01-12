private void supplySize(double x, double y, double z, double r) {
    if ((this.x) == null)
        this.x = x;
    
    if ((this.y) == null)
        this.y = y;
    
    if ((this.z) == null)
        this.z = z;
    
    if (java.lang.Double.isNaN(this.r))
        this.r = r;
    
}