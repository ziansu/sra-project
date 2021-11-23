public synchronized void addScheduledFailure(java.lang.String s) {
    java.lang.System.out.println(("Adding scheduled failure: " + s));
    java.lang.String[] split = s.split("\\s+");
    int k = java.lang.Integer.parseInt(split[1]);
    int delta = java.lang.Integer.parseInt(split[2]);
    scheduledFailures.add(new record.FailureRecord(k, delta));
    if ((this.currentScheduledFailure) == null) {
        this.currentScheduledFailure = scheduledFailures.get(0);
    }
}