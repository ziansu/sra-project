public java.util.Map<java.lang.Integer, java.time.Duration> getParticipantLapTimes(de.warhog.fpvlaptracker.race.entities.Participant participant) {
    java.util.Map<java.lang.Integer, java.time.Duration> result = new java.util.HashMap<>();
    if (participants.containsKey(participant)) {
        de.warhog.fpvlaptracker.race.entities.ParticipantRaceData participantRaceData = participants.get(participant);
        return participantRaceData.getLaps();
    }
    throw new java.lang.IllegalArgumentException(("participant not found: " + (participant.toString())));
}