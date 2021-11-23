public com.layer.atlas.AtlasAvatar setParticipant(com.layer.atlas.provider.Participant participant) {
    mParticipants.clear();
    mParticipants.put(participant.getId(), participant);
    update();
    return this;
}