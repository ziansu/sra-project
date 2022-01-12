public <T extends politics.parties.Party> void voteParty(T party) {
    if (party != null) {
        parliament.voteParty(party);
        notifyObservers(this);
    }
}