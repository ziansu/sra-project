@java.lang.Override
public void write(org.apache.ignite.internal.processors.hadoop.HadoopJob job, org.apache.ignite.internal.processors.hadoop.counter.HadoopCounters cntrs) throws org.apache.ignite.IgniteCheckedException {
    delegate(job).write(job, cntrs);
}