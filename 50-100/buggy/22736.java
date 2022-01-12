public com.nanosai.gridops.ion.read.IonReader setSource(byte[] source, int sourceOffset, int length) {
    this.source = source;
    this.index = sourceOffset;
    this.nextIndex = sourceOffset;
    this.sourceLength = length;
    this.intoIndexStackIndex = 0;
    this.scopeEndIndex = length;
    return this;
}