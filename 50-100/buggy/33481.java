private org.jitsi.impl.neomedia.recording.SynchronizerImpl.SSRCDesc getSSRCDesc(long ssrc) {
    org.jitsi.impl.neomedia.recording.SynchronizerImpl.SSRCDesc ssrcDesc = ssrcs.get(ssrc);
    if (ssrcDesc == null) {
        synchronized(ssrcs) {
            ssrcDesc = ssrcs.get(ssrc);
            if (ssrcDesc == null) {
                ssrcDesc = new org.jitsi.impl.neomedia.recording.SynchronizerImpl.SSRCDesc();
                ssrcs.put(ssrc, ssrcDesc);
            }
        }
    }
    return ssrcDesc;
}