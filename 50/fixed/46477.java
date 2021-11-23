void reset(long ssrc) {
    synchronized(buffers) {
        buffers.remove(ssrc);
    }
}