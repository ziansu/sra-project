@java.lang.Override
protected void cleanup(org.apache.kylin.engine.mr.steps.Context context) throws java.io.IOException, java.lang.InterruptedException {
    if (collectStatistics) {
        long grandTotal = 0;
        for (org.apache.kylin.common.hll.HyperLogLogPlusCounter hll : cuboidHLLMap.values()) {
            grandTotal += hll.getCountEstimate();
        }
        double mapperOverlapRatio = ((double) (totalRowsBeforeMerge)) / grandTotal;
        writeMapperAndCuboidStatistics(context);
        org.apache.kylin.engine.mr.common.CuboidStatsUtil.writeCuboidStatistics(context.getConfiguration(), new org.apache.hadoop.fs.Path(statisticsOutput), cuboidHLLMap, samplingPercentage, mapperOverlapRatio);
    }
}