@java.lang.Override
protected void beforeTestsStarted() throws java.lang.Exception {
    startGrids(nodeCount());
    org.apache.ignite.internal.processors.hadoop.impl.igfs.IgniteHadoopFileSystemWithIgniteClientSelfTest.test = this;
}