private org.jitsi.impl.neomedia.recording.PacketBuffer.Buffer getBuffer(long ssrc) {
    org.jitsi.impl.neomedia.recording.PacketBuffer.Buffer buffer = buffers.get(ssrc);
    if (buffer == null) {
        synchronized(buffers) {
            buffer = buffers.get(ssrc);
            if (buffer == null) {
                buffer = new org.jitsi.impl.neomedia.recording.PacketBuffer.Buffer(org.jitsi.impl.neomedia.recording.PacketBuffer.SIZE, ssrc);
                buffers.put(ssrc, buffer);
            }
        }
    }
    return buffer;
}