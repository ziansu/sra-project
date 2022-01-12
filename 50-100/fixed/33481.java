private org.jitsi.impl.neomedia.recording.SynchronizerImpl.SSRCDesc getSSRCDesc(long ssrc) {
    synchronized(ssrcs) {
        org.jitsi.impl.neomedia.recording.SynchronizerImpl.SSRCDesc ssrcDesc = ssrcs.get(ssrc);
        if (ssrcDesc == null) {
            ssrcDesc = new org.jitsi.impl.neomedia.recording.SynchronizerImpl.SSRCDesc();
            ssrcs.put(ssrc, ssrcDesc);
        }
        return ssrcDesc;
    }
}