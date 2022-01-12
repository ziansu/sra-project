private static void validateEpisode(me.tdjones.main.model.Episode episode) {
    try {
        if ((episode.getThumbnail().getUrl()) == null) {
            episode.setThumbnail(episode.getFeed().getThumbnail());
        }else {
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}