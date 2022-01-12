public int compare(Point v, Point w) {
    if ((v == null) || (w == null))
        throw new java.lang.NullPointerException();
    
    double vd = this.slopeTo(v);
    double wd = this.slopeTo(w);
    if (vd == wd)
        return 0;
    else
        if (vd < wd)
            return -1;
        else
            return 1;
        
    
}