public static java.lang.Boolean runConcurrentlyAndAggregate(int nThreads, java.util.Collection<java.util.concurrent.Callable<java.lang.Boolean>> theCallable) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    java.util.List<java.lang.Boolean> result = gitp4.Utils.runConcurrently(nThreads, theCallable);
    for (java.lang.Boolean b : result) {
        if (!b)
            return false;
        
    }
    return true;
}