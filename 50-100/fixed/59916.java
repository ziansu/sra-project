@java.lang.Override
public java.lang.Long call() throws java.lang.Exception {
    for (int i = 0; i < (this.numQueries); i++) {
        doQuery(i);
    }
    doSomeComputation();
    long totalTime = swTotal.getTime();
    java.lang.System.out.println((((("Request " + (this.workerNumber)) + " took ") + (this.swTotal.getTime())) + " millis to complete"));
    this.onComplete.execute();
    return totalTime;
}