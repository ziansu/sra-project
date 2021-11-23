public double[] getAbsAccelerationBuffer() {
    double[] absAccelerationBufferCopy = new double[absAccelerationBuffer.length];
    java.lang.System.arraycopy(absAccelerationBuffer, ((timeIndex) + 1), absAccelerationBufferCopy, 0, ((absAccelerationBuffer.length) - ((timeIndex) + 1)));
    java.lang.System.arraycopy(absAccelerationBuffer, 0, absAccelerationBufferCopy, ((absAccelerationBuffer.length) - ((timeIndex) + 1)), ((timeIndex) + 1));
    return absAccelerationBufferCopy;
}