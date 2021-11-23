@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.esa.snap.framework.gpf.GPF.getDefaultInstance().getOperatorSpiRegistry().addOperatorSpi(algoSpi);
    org.esa.snap.framework.gpf.GPF.getDefaultInstance().getOperatorSpiRegistry().addOperatorSpi(writeSpi);
    outputFile = org.esa.snap.GlobalTestConfig.getBeamTestDataOutputFile("WriteOpTest/writtenProduct.dim");
    outputFile.getParentFile().mkdirs();
    javax.media.jai.TileScheduler tileScheduler = javax.media.jai.JAI.getDefaultInstance().getTileScheduler();
    oldParallelism = tileScheduler.getParallelism();
    tileScheduler.setParallelism(java.lang.Runtime.getRuntime().availableProcessors());
}