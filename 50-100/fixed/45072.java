private com.google.common.collect.Multimap<org.waveprotocol.wave.model.id.WaveId, org.waveprotocol.wave.model.id.WaveletId> createWavesViewToFilter(final org.waveprotocol.wave.model.wave.ParticipantId user, final boolean isAllQuery) {
    com.google.common.collect.Multimap<org.waveprotocol.wave.model.id.WaveId, org.waveprotocol.wave.model.id.WaveletId> currentUserWavesView;
    currentUserWavesView = com.google.common.collect.HashMultimap.create();
    currentUserWavesView.putAll(subscriber.getPerUserWaveView(user));
    if (isAllQuery) {
        currentUserWavesView.putAll(subscriber.getPerUserWaveView(sharedDomainParticipantId));
    }
    return currentUserWavesView;
}