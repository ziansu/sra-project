public org.openfootie.api.simulator.TeamRanking filterByParticipants(java.util.List<org.openfootie.api.domain.Rankable> participants) {
    java.util.List<org.openfootie.api.domain.Rankable> filteredParticipants = new java.util.ArrayList<org.openfootie.api.domain.Rankable>();
    for (int i = 1; i < (ranking.size()); i++) {
        if (participants.contains(this.ranking.get(i))) {
            filteredParticipants.add(this.ranking.get(i));
        }
    }
    return new org.openfootie.api.simulator.TeamRanking(filteredParticipants);
}