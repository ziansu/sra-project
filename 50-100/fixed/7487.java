boolean hasTournamentBeenUpdated(@android.support.annotation.NonNull
final net.erikkarlsson.smashapp.common.data.Lce<net.erikkarlsson.smashapp.common.data.entities.tournament.Tournament> tournamentLce) {
    if (!(tournamentLce.hasData())) {
        return false;
    }
    net.erikkarlsson.smashapp.common.data.entities.tournament.Tournament tournament = tournamentLce.data();
    return !(tournament().updatedAt().equals(tournament.updatedAt()));
}