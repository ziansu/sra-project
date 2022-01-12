private void writeParticipantsInGroups() {
    for (int i = 0; i < (amountOfGroups); i++) {
        for (int z = 0; z < (amountOfPersonsPerGroup); z++) {
            groups.get(z)[i] = participants.get(participantPlace);
            (participantPlace)++;
        }
    }
}