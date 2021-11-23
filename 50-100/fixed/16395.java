public int scaleDouble(Tag tag, double value) {
    if (value < (tag.fmin))
        return 0;
    
    if (value > (tag.fmax))
        return 100;
    
    double delta = (tag.fmax) - (tag.fmin);
    double fval = value;
    double fmin = tag.fmin;
    return ((int) (((fval - fmin) / delta) * 100.0));
}