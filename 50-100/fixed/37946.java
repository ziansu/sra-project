private java.lang.Integer findCommonSum(com.mattdrees.dropboxcalories.SumSetSolver negativeSolver, com.mattdrees.dropboxcalories.SumSetSolver positiveSolver) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newCachedThreadPool();
    java.util.concurrent.Future<java.util.SortedSet<java.lang.Integer>> negativeSumsFuture = executorService.submit(negativeSolver);
    java.util.concurrent.Future<java.util.SortedSet<java.lang.Integer>> positiveSumsFuture = executorService.submit(positiveSolver);
    java.util.SortedSet<java.lang.Integer> negativeSums = negativeSumsFuture.get();
    java.util.SortedSet<java.lang.Integer> positiveSums = positiveSumsFuture.get();
    return findCommonSum(negativeSums, positiveSums);
}