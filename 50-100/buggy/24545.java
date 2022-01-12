private void checkUnfoundPoint(int att, float value) {
    boolean found = false;
    for (java.util.Iterator<moa.reduction.bayes.REBdiscretize.Interval> iterator = allIntervals[att].values().iterator(); iterator.hasNext();) {
        moa.reduction.bayes.REBdiscretize.Interval interval = iterator.next();
        if (interval.histogram.containsKey(value)) {
            found = true;
        }
    }
    if (!found)
        java.lang.System.err.println("Not found");
    
}