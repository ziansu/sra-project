public static <R> java.util.concurrent.Future<R> allOfInclusiveResultFuture(final java.util.concurrent.Future<R> resultFuture, final java.util.concurrent.Future... futures) {
    final java.util.List<java.util.concurrent.Future> futureList = java.util.Arrays.asList(futures);
    futureList.add(resultFuture);
    return org.openbase.jul.schedule.AbstractExecutorService.allOf(org.openbase.jul.schedule.AbstractExecutorService.getInstance().getExecutorService(), () -> resultFuture.get(), futureList);
}