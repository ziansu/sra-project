public void addEpisode(nu.hex.rpg.manager.core.domain.rpg.Episode episode) {
    if (!(episodes.contains(episode))) {
        episode.setAdventure(this);
        this.episodes.add(episode);
    }
}