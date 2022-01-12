public zipkin.collector.sqs.SQSCollector.Builder waitTimeSeconds(int seconds) {
    zipkin.internal.Util.checkArgument(((seconds > 0) && (seconds < 21)), "waitTimeSeconds");
    this.waitTimeSeconds = seconds;
    return this;
}