public java.lang.String call() throws java.lang.Exception {
    java.lang.String ctName = java.lang.Thread.currentThread().getName();
    java.lang.Thread.currentThread().setName(((((threadName) + "[") + ctName) + "]"));
    org.apache.log4j.NDC.push(threadNDC);
    return doPipeWithTimeoutGuarded(input, session);
}