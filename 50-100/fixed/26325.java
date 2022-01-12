public java.lang.Boolean checkBound() {
    if ((((ssquare) == null) || (((ssquare) == 0.0) && ((numberOfRuns) < (minNumberOfRuns)))) || ((numberOfRuns) < (minNumberOfRuns)))
        return false;
    
    java.lang.Double bound = ((java.lang.Math.pow(t, 2.0)) * (ssquare)) / (java.lang.Math.pow(halfIntervalWidth, 2.0));
    return bound <= (numberOfRuns);
}