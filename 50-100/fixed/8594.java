public com.nanosai.gridops.ion.read.IonReader setSource(com.nanosai.gridops.mem.MemoryBlock sourceMemoryBlock) {
    this.source = sourceMemoryBlock.memoryAllocator.data;
    this.index = sourceMemoryBlock.startIndex;
    this.nextIndex = sourceMemoryBlock.startIndex;
    this.sourceLength = sourceMemoryBlock.lengthWritten();
    this.intoIndexStackIndex = 0;
    this.scopeEndIndex = (this.index) + (this.sourceLength);
    return this;
}