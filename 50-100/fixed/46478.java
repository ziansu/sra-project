private boolean isBoundary(moa.reduction.bayes.REBdiscretize.Interval ceiling, float value, int clas) {
    java.util.NavigableSet<java.lang.Float> keys = ((java.util.NavigableSet<java.lang.Float>) (ceiling.histogram.keySet()));
    java.lang.Float greater = keys.ceiling(value);
    if (greater == null)
        return true;
    
    if (greater == value)
        return false;
    
    java.util.Collection<java.lang.Integer> vcls = ceiling.histogram.get(greater);
    if (vcls.contains(clas))
        return false;
    
    return true;
}