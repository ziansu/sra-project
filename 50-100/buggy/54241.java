public static com.ebay.quality.compare.ExecutionServiceImpl getexecutionSrvcImpl(int threadCount) {
    com.ebay.quality.compare.ExecutionServiceImpl executionSrvcImpl = com.ebay.quality.compare.ExecutionServiceImpl.ExecutionServiceImplLoader.executionSrvcImpl;
    if (threadCount > 0)
        com.ebay.quality.compare.ExecutionServiceImpl.NUMBER_OF_THREADS = threadCount;
    
    com.ebay.quality.compare.ExecutionServiceImpl.LOGGER.info(("Number of application threads:" + (com.ebay.quality.compare.ExecutionServiceImpl.NUMBER_OF_THREADS)));
    com.ebay.quality.compare.ExecutionServiceImpl.executor = java.util.concurrent.Executors.newFixedThreadPool(com.ebay.quality.compare.ExecutionServiceImpl.NUMBER_OF_THREADS);
    return executionSrvcImpl;
}