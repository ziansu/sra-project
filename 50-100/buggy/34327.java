public int compare(Point v, Point w) {
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