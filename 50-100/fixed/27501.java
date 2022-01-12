@java.lang.Override
public void setRtpClockRate(long ssrc, long clockRate) {
    org.jitsi.impl.neomedia.recording.SynchronizerImpl.SSRCDesc ssrcDesc = getSSRCDesc(ssrc);
    synchronized(ssrcDesc) {
        if ((ssrcDesc.clockRate) == (-1))
            ssrcDesc.clockRate = clockRate;
        else
            if ((ssrcDesc.clockRate) != clockRate) {
                ssrcDesc.clockRate = clockRate;
                ssrcDesc.ntpTime = -1.0;
                ssrcDesc.rtpTime = -1;
            }
        
    }
}