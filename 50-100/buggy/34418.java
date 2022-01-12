public boolean equals(java.lang.Object p2) {
    if ((this) == p2)
        return true;
    
    if ((p2 == null) || ((getClass()) != (p2.getClass())))
        return false;
    
    pl.com.bottega.commons.math.Probability.Probability probability2 = ((pl.com.bottega.commons.math.Probability.Probability) (p2));
    double delta = 1.0E-5;
    return ((value) < (probability2.value) ? value : probability2.value) < delta;
}