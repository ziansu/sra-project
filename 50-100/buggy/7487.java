boolean hasTournamentBeenUpdated(@android.support.annotation.NonNull
final net.erikkarlsson.smashapp.common.data.Lce<net.erikkarlsson.smashapp.common.data.entities.tournament.Tournament> tournamentLce) {
    net.erikkarlsson.smashapp.common.data.entities.tournament.Tournament tournament = (tournamentLce.hasData()) ? com.google.common.base.Preconditions.checkNotNull(tournamentLce.data()) : net.erikkarlsson.smashapp.common.data.entities.tournament.Tournament.NO_TOURNAMENT;
    return !(tournament().updatedAt().equals(tournament.updatedAt()));
}