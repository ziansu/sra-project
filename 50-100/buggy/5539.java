private java.util.Map<edu.cmu.ml.proppr.prove.wam.Goal, java.lang.Double> scaleFD(java.util.Map<edu.cmu.ml.proppr.prove.wam.Goal, java.lang.Double> fd, double wt) {
    if (wt == 1.0)
        return fd;
    
    java.util.Map<edu.cmu.ml.proppr.prove.wam.Goal, java.lang.Double> ret = new java.util.HashMap<edu.cmu.ml.proppr.prove.wam.Goal, java.lang.Double>();
    ret.putAll(fd);
    for (java.util.Map.Entry<edu.cmu.ml.proppr.prove.wam.Goal, java.lang.Double> val : fd.entrySet()) {
        val.setValue(((val.getValue()) * wt));
    }
    return ret;
}