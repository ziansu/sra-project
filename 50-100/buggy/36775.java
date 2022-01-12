@java.lang.Override
protected double computeIntermediateMemEstimate(long dim1, long dim2, long nnz) {
    double ret = 0;
    if (((_op) == (OpOp1.IQM)) || ((_op) == (OpOp1.MEDIAN))) {
        ret = (getInput().get(0).getMemEstimate()) * 3;
    }
    if (isGPUEnabled()) {
        org.apache.sysml.hops.OptimizerUtils.estimateSize(dim1, dim2);
    }
    return ret;
}