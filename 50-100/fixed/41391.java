public long[] getSimulcastLayersSSRCs(java.lang.String peerJid) {
    mock.util.ConferenceUtility confUtility = getConferenceUtility();
    java.lang.String conferenceId = confUtility.getJvbConferenceId();
    java.lang.String videoChannelId = confUtility.getParticipantVideoChannelId(peerJid);
    java.util.List<mock.util.SimulcastLayer> layers = mockBridge.getSimulcastLayers(conferenceId, videoChannelId);
    long[] ssrcs = new long[layers.size()];
    int idx = 0;
    for (mock.util.SimulcastLayer layer : layers) {
        ssrcs[(idx++)] = layer.getPrimarySSRC();
    }
    return ssrcs;
}