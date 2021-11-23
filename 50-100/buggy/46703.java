public void changeIsSeenForAnEpisode(java.lang.String seasonNum, java.lang.String episodeNum, boolean newIsWatched) {
    for (com.rotem.showme.Models.Episode ep : this.m_episodes_list) {
        if ((seasonNum.equals(ep.getSeasonNumber())) && (episodeNum.equals(ep.getEpisodeNumber()))) {
            ep.setIsWatched(newIsWatched);
            break;
        }
    }
}