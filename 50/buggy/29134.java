public zipkin.collector.sqs.SQSCollector.Builder waitTimeSeconds(int seconds) {
    zipkin.internal.Util.checkArgument((((parallelism) > 0) && ((parallelism) < 21)), "waitTimeSeconds");
    this.waitTimeSeconds = seconds;
    return this;
}