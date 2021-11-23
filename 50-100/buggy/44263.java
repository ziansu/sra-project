private java.lang.String onRoundEnd() {
    java.util.ArrayList<values.TournamentParticipant> participants = new java.util.ArrayList<>();
    for (values.TournamentParticipant participant : _matchedOpponents) {
        participants.add(participant);
    }
    matchOpponents(participants);
    _amountOfPlayersAtRoundStart = _matchedOpponents.size();
    return getMatchedOpponents(_matchedOpponents);
}