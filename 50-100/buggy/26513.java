protected void handleByePacket(java.net.SocketAddress origin, sas.systems.imflux.packet.rtcp.ByePacket packet) {
    for (java.lang.Long ssrc : packet.getSsrcList()) {
        sas.systems.imflux.participant.RtpParticipant participant = this.participantDatabase.getParticipant(ssrc);
        if (participant != null) {
            participant.byeReceived();
            for (sas.systems.imflux.session.rtp.RtpSessionEventListener listener : eventListeners) {
                listener.participantLeft(this, participant);
            }
        }
    }
    sas.systems.imflux.session.rtp.AbstractRtpSession.LOG.trace("Received BYE for participants with SSRCs {} in session with id '{}' (reason: '{}').", packet.getSsrcList(), this.id, packet.getReasonForLeaving());
}