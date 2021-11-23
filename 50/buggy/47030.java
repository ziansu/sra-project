private void initOpState(byte opCode, com.gemstone.gemfire.internal.cache.persistence.DiskRegionView dr, com.gemstone.gemfire.internal.cache.DiskEntry entry, java.nio.ByteBuffer value, int valueLength, byte userBits, boolean notToUseUserBits) throws java.io.IOException {
    this.opState.initialize(opCode, dr, entry, value, valueLength, userBits, notToUseUserBits);
}