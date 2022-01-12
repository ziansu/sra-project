public boolean awaitMotionStart(double timeoutSeconds) {
    motionStartLock.lock();
    try {
        boolean motionDetected = isMotionDetected(teaselib.motiondetection.MotionDetector.MotionInertia);
        if (!motionDetected) {
            motionDetected = motionStart.await((((long) (timeoutSeconds)) * 1000), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        return motionDetected;
    } catch (java.lang.InterruptedException e) {
        throw new java.lang.RuntimeException(e);
    } finally {
        motionStartLock.unlock();
    }
}