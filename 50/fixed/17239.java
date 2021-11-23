public void changeIsSeenForASeason(java.lang.String seasonNum, boolean newIsWatched) {
    for (com.rotem.showme.Models.Episode ep : this.m_episodes_list) {
        if (seasonNum.equals(java.lang.Integer.toString(ep.getSeasonNumber()))) {
            ep.setIsWatched(newIsWatched);
        }
    }
}