private void addSDES(org.jitsi.impl.neomedia.recording.RawPacket pkt) {
    if (org.jitsi.impl.neomedia.recording.SynchronizerImpl.USE_CNAME_AS_ENDPOINT_ID) {
        for (org.jitsi.impl.neomedia.recording.SynchronizerImpl.CNAMEItem item : getCnameItems(pkt)) {
            org.jitsi.impl.neomedia.recording.SynchronizerImpl.SSRCDesc ssrc = getSSRCDesc(item.ssrc);
            if ((ssrc.endpointId) == null) {
                synchronized(ssrc) {
                    if ((ssrc.endpointId) == null)
                        ssrc.endpointId = item.cname;
                    
                }
            }
        }
    }
}