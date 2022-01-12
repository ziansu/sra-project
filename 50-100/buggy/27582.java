private org.apache.commons.math3.linear.RealVector getMean(java.util.List<? extends macrobase.datamodel.HasMetrics> data) {
    org.apache.commons.math3.linear.RealVector vec = null;
    for (macrobase.datamodel.HasMetrics d : data) {
        org.apache.commons.math3.linear.RealVector dvec = d.getMetrics();
        if (vec == null) {
            vec = dvec;
        }else {
            vec.add(dvec);
        }
    }
    return vec.mapDivide(data.size());
}