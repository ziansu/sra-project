private static void validateEpisode(me.tdjones.main.model.Episode episode) {
    if (((episode.getThumbnail()) == null) || ((episode.getThumbnail().getUrl()) == null)) {
        episode.setThumbnail(episode.getFeed().getThumbnail());
    }
}