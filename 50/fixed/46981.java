private void finish() {
    com.bgu.dsp.main.SqsLooper.log.info("deleting queue and shutting down .");
    env.heartBit.stop();
    com.bgu.dsp.awsUtils.SQSUtils.deleteQueue(env.inQueueUrl);
    com.bgu.dsp.awsUtils.S3Utils.deleteAllS3();
    env.executor.shutdownNow();
}