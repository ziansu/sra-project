public double[] getAbsAccelerationBuffer() {
    double[] absAccelerationBufferCopy = new double[absAccelerationBuffer.length];
    java.lang.System.arraycopy(absAccelerationBuffer, timeIndex, absAccelerationBufferCopy, 0, ((absAccelerationBuffer.length) - (timeIndex)));
    java.lang.System.arraycopy(absAccelerationBuffer, 0, absAccelerationBufferCopy, ((absAccelerationBuffer.length) - (timeIndex)), timeIndex);
    return absAccelerationBufferCopy;
}