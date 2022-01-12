private boolean isMotionDetected(int pastFrames) {
    synchronized(mi) {
        double dm = mi.getMotion(pastFrames);
        return dm > (areaTreshold);
    }
}