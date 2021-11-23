private void runAllTests(be.bagofwords.db.benchmarks.bigrams.DataType dataType, be.bagofwords.minidepi.ApplicationContext applicationContext) throws java.io.FileNotFoundException, java.lang.InterruptedException {
    be.bagofwords.logging.Log.i(("Testing batch writing / reading for data type " + dataType));
    testSeparateWritingReading(dataType, new be.bagofwords.db.filedb.FileDataInterfaceFactory(applicationContext), DatabaseCachingType.CACHED_AND_BLOOM);
    be.bagofwords.logging.Log.i(("Testing mixed writing / reading for data type " + dataType));
}