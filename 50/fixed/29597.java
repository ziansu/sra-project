@restx.security.PermitAll
@restx.annotations.PUT(value = "/{showId}/{seasonNumber}/{episodeNumber}")
public void searchEpisode(org.bson.types.ObjectId showId, java.lang.Integer seasonNumber, java.lang.Integer episodeNumber) {
    showService.searchEpisode(showId, seasonNumber, episodeNumber);
}