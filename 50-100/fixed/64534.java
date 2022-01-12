public com.mediator.model.VideoEntry apply(com.mediator.model.tmdb.TMDbTVEpisodeResult tmdbTVEpisodeResult) {
    com.mediator.helpers.TinyLogger.d(("title found: " + (tmdbTVEpisodeResult.getName())));
    videoEntry.setEpisodeNumber(tmdbTVEpisodeResult.getEpisodeNumber());
    videoEntry.setSeasonNumber(tmdbTVEpisodeResult.getSeasonNumber());
    videoEntry.setTitle(tmdbTVEpisodeResult.getName());
    return videoEntry;
}