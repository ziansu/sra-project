@java.lang.Override
protected void tearDown() throws java.lang.Exception {
    org.esa.snap.framework.gpf.GPF.getDefaultInstance().getOperatorSpiRegistry().removeOperatorSpi(algoSpi);
    org.esa.snap.framework.gpf.GPF.getDefaultInstance().getOperatorSpiRegistry().removeOperatorSpi(writeSpi);
    java.io.File parentFile = outputFile.getParentFile();
    org.esa.snap.util.io.FileUtils.deleteTree(parentFile);
    javax.media.jai.TileScheduler tileScheduler = javax.media.jai.JAI.getDefaultInstance().getTileScheduler();
    tileScheduler.setParallelism(oldParallelism);
}