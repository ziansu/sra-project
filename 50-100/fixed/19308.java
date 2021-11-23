private void writeParticipantsInGroups() {
    for (int i = 0; i < (amountOfPersonsPerGroup); i++) {
        for (int z = 0; z < (amountOfGroups); z++) {
            groups.get(z)[i] = participants.get(participantPlace);
            (participantPlace)++;
        }
    }
}