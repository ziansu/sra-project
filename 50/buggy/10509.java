public void execute(backtype.storm.tuple.Tuple tuple) {
    delegateExecute(tuple);
    if (sendOnlyOnce) {
        try {
            initiateEmitter();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        sendOnlyOnce = false;
    }
}