void reset(long ssrc) {
    synchronized(buffers) {
        org.jitsi.impl.neomedia.recording.PacketBuffer.Buffer buffer = buffers.get(ssrc);
        if (buffer != null)
            buffers.remove(ssrc);
        
    }
}