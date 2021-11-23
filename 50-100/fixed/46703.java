public void changeIsSeenForAnEpisode(java.lang.String seasonNum, java.lang.String episodeNum, boolean newIsWatched) {
    for (com.rotem.showme.Models.Episode ep : this.m_episodes_list) {
        if ((seasonNum.equals(java.lang.Integer.toString(ep.getSeasonNumber()))) && (episodeNum.equals(java.lang.Integer.toString(ep.getEpisodeNumber())))) {
            ep.setIsWatched(newIsWatched);
            break;
        }
    }
}