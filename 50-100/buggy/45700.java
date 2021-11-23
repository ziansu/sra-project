public double[] getAbsAccelerationBuffer() {
    double[] absAccelerationBufferCopy = new double[absAccelerationBuffer.length];
    synchronized(this) {
        java.lang.System.arraycopy(absAccelerationBuffer, 0, absAccelerationBufferCopy, timeIndex, ((absAccelerationBuffer.length) - (timeIndex)));
        java.lang.System.arraycopy(absAccelerationBuffer, timeIndex, absAccelerationBufferCopy, 0, timeIndex);
    }
    return absAccelerationBufferCopy;
}