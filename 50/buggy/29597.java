@restx.security.PermitAll
@restx.annotations.PUT(value = "/{showId}/{seasonNumber}/{episodeNumber}")
public void searchEpisode(org.bson.types.ObjectId showId, java.lang.String seasonNumber, java.lang.String episodeNumber) {
    showService.searchEpisode(showId, seasonNumber, episodeNumber);
}