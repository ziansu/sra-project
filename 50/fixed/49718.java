public com.layer.atlas.AtlasAvatar setParticipant(com.layer.atlas.provider.Participant participant) {
    mParticipants.clear();
    if (participant != null) {
        mParticipants.put(participant.getId(), participant);
    }
    update();
    return this;
}