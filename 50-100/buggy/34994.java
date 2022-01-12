public boolean awaitMotionEnd(double timeoutSeconds) {
    motionEndLock.lock();
    try {
        t.setAreaTreshold(teaselib.motiondetection.MotionDetector.InitialAreaTreshold);
        boolean motionStopped = !(isMotionDetected(teaselib.motiondetection.MotionDetector.MotionInertia));
        if (!motionStopped) {
            motionStopped = motionEnd.await((((long) (timeoutSeconds)) * 1000), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        return motionStopped;
    } catch (java.lang.InterruptedException e) {
        throw new java.lang.RuntimeException(e);
    } finally {
        motionEndLock.unlock();
    }
}