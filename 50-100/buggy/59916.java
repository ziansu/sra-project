@java.lang.Override
public java.lang.Long call() throws java.lang.Exception {
    StopWatch swTotal = new StopWatch();
    swTotal.start();
    for (int i = 0; i < (numQueries); i++) {
        doQuery(i);
    }
    doSomeComputation();
    long totalTime = swTotal.getTime();
    java.lang.System.out.println((((("Request " + (workerNumber)) + " took ") + (swTotal.getTime())) + " millis to complete"));
    onComplete.execute();
    return totalTime;
}