private void initialVectorizedRowBatchCtx(org.apache.hadoop.conf.Configuration conf) throws org.apache.hadoop.hive.ql.metadata.HiveException {
    org.apache.hadoop.hive.ql.plan.MapWork mapWork = new org.apache.hadoop.hive.ql.plan.MapWork();
    org.apache.hadoop.hive.ql.exec.vector.VectorizedRowBatchCtx rbCtx = new org.apache.hadoop.hive.ql.exec.vector.VectorizedRowBatchCtx();
    rbCtx.init(createStructObjectInspector(conf), new java.lang.String[0]);
    mapWork.setVectorMode(true);
    mapWork.setVectorizedRowBatchCtx(rbCtx);
    org.apache.hadoop.hive.ql.exec.Utilities.setMapWork(conf, mapWork);
}