@java.lang.Override
public void onError(java.lang.Throwable error) {
    io.grpc.Status status = io.grpc.Status.fromThrowable(error);
    com.google.cloud.speech.grpc.demos.RecognizeClient.logger.log(java.util.logging.Level.WARNING, "recognize failed: {0}", status);
    finishLatch.countDown();
}