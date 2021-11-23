public void countEvent(double x) {
    double bin = ((numbin) * (x - (from))) / ((to) - (from));
    if (bin >= (numbin)) {
        bin = (numbin) - 1;
    }else
        if (bin < 0)
            bin = 0;
        
    
    (bins[((int) (bin))])++;
    (eventcount)++;
}