public moa.reduction.bayes.REBdiscretize.Interval splitByPrevMerge(int att) {
    java.lang.Float value = oldPoints.pollLast();
    if (value != null)
        return splitInterval(att, value);
    
    return null;
}