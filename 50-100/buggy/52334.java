private org.apache.commons.math3.linear.RealMatrix getCovariance(java.util.List<? extends macrobase.datamodel.HasMetrics> data) {
    int p = data.iterator().next().getMetrics().getDimension();
    org.apache.commons.math3.linear.RealMatrix ret = new org.apache.commons.math3.linear.Array2DRowRealMatrix(data.size(), p);
    int idx = 0;
    for (macrobase.datamodel.HasMetrics d : data) {
        ret.setRow(idx, d.getMetrics().toArray());
        idx += 1;
    }
    return new org.apache.commons.math3.stat.correlation.Covariance(ret).getCovarianceMatrix();
}