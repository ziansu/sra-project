public void update(long timestamp) {
    for (int segment = 0; segment < (segmentSizes.length); segment++) {
        us.ihmc.robotDataLogger.dataBuffers.RegistrySendBuffer buffer = ringBuffer.next();
        if (buffer != null) {
            buffer.updateBufferFromVariables(timestamp, uid, segment, segmentOffsets[segment], segmentSizes[segment]);
            ringBuffer.commit();
        }else {
            this.loggerDebugRegistry.circularBufferFull();
        }
        (uid)++;
    }
}