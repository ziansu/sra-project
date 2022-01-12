private void calculateSize() {
    int valueStart = offsets[arrayOffset];
    int valueEnd = offsets[((arrayOffset) + (positionCount))];
    sizeInBytes = (values.getRegionSizeInBytes(valueStart, (valueEnd - valueStart))) + (((java.lang.Integer.BYTES) + (java.lang.Byte.BYTES)) * ((long) (this.positionCount)));
}