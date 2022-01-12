public static java.lang.Boolean runConcurrentlyAndAggregate(int nThreads, java.util.Collection<java.util.concurrent.Callable<java.lang.Boolean>> theCallable, java.util.function.Consumer<java.lang.Boolean> onEachDone) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    java.util.List<java.lang.Boolean> result = gitp4.Utils.runConcurrently(nThreads, theCallable, onEachDone);
    for (java.lang.Boolean b : result) {
        if (!b)
            return false;
        
    }
    return true;
}